package com.test.service.impl;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.test.exception.MFilesException;
import com.test.model.*;
import com.test.model.enums.MFDataType;
import com.test.service.MfilesClientService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MfilesClientServiceImpl implements MfilesClientService {

    private String mFilesServerRESTURI = "http://127.0.0.1:8082/REST";
    private CloseableHttpClient httpClient;
    private final JsonParser parser;
    private final Gson gson;
    private Token token;
    private Authentication auth;

    public MfilesClientServiceImpl() {
        httpClient = HttpClientBuilder.create().build();
        parser = new JsonParser();
        gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        auth = new Authentication("login", "pass");
        auth.setWindowsUser(true);
        authentication(auth);
    }

    private void authentication(Authentication authentication) {
        HttpPost request = new HttpPost(mFilesServerRESTURI + "/server/authenticationtokens");
        request.setHeader("Accept", "application/json");
        final HttpEntity entity = new StringEntity(gson.toJson(authentication), "UTF-8");
        request.setEntity(entity);
        final String execute = execute(request);
        token = gson.fromJson(execute, new TypeToken<Token>() {
        }.getType());
    }

    private String execute(HttpUriRequest request) {
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            final String responseString = EntityUtils.toString(response.getEntity());
            final int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 500 || statusCode == 401) {
                throw new MFilesException(statusCode, responseString);
            }
            return responseString;
        } catch (IOException e) {
            e.printStackTrace();
            throw new MFilesException(500, e.getMessage());
        }
    }

    @Override
    public FolderContentItems getRootView(String path) {
        HttpGet request = new HttpGet(mFilesServerRESTURI + path);
        request.setHeader("X-Authentication", token.getValue());
        final String execute = execute(request);
        return gson.fromJson(execute, new TypeToken<FolderContentItems>() {
        }.getType());
    }

    @Override
    public void getObjectFile(ObjectVersion objectVersion) {
        for (ObjectFile file : objectVersion.getFiles()) {
            HttpGet request = new HttpGet(mFilesServerRESTURI + "/objects/" + objectVersion.getObjVer().getType() + "/"
                    + objectVersion.getObjVer().getID() + "/" + objectVersion.getObjVer().getVersion() + "/files/" + file.getID() + "/content");
            request.setHeader("X-Authentication", token.getValue());
            final String execute = execute(request);
            System.out.println(execute);
        }
//        return gson.fromJson(execute, new TypeToken<ObjectFile>() {}.getType());
    }

    @Override
    public List<Vault> getVaults() {
        HttpGet request = new HttpGet(mFilesServerRESTURI + "/server/vaults");
        request.setHeader("X-Authentication", token.getValue());
        final String execute = execute(request);
        return gson.fromJson(execute, new TypeToken<List<Vault>>() {
        }.getType());
    }

    @Override
    public void authInVault(Vault vault) {
        auth.setVaultGuid(vault.getGUID());
        authentication(auth);
    }

    @Override
    public void createObject(int type, File file) {
        HttpPost uploadRequest = new HttpPost(mFilesServerRESTURI + "/files");
        uploadRequest.setHeader("X-Authentication", token.getValue());
        uploadRequest.setHeader("Content-type", "application/octet-stream");
//        HttpEntity entity = MultipartEntityBuilder.create()
//                .addPart("file", new FileBody(file))
//                .build();
        FileEntity fileEntity = new FileEntity(file);
        uploadRequest.setEntity(fileEntity);
        final String execute = execute(uploadRequest);
        System.out.println(execute);

        UploadInfo uploadInfo = gson.fromJson(execute, new TypeToken<UploadInfo>() {
        }.getType());

        uploadInfo.setExtension(file.getName().substring(file.getName().indexOf(".") + 1));

        ObjectCreationInfo objectCreationInfo = new ObjectCreationInfo(new PropertyValue[]{
                new PropertyValue(100, new TypedValue(MFDataType.Lookup, new Lookup(1, -1))),
                new PropertyValue(0, new TypedValue(MFDataType.Text,
                        file.getName().substring(0, file.getName().indexOf("."))))
        }, new UploadInfo[]{uploadInfo});

        HttpPost createRequest = new HttpPost(mFilesServerRESTURI + "/objects/" + type);
        createRequest.setHeader("X-Authentication", token.getValue());
        createRequest.setHeader("Accept", "application/json");
        final HttpEntity creationInfo = new StringEntity(gson.toJson(objectCreationInfo), "UTF-8");
        createRequest.setEntity(creationInfo);
        String execute1 = execute(createRequest);
        System.out.println(execute1);
    }
}
