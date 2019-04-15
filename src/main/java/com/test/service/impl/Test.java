package com.test.service.impl;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.model.FolderContentItem;
import com.test.model.FolderContentItems;
import com.test.model.Vault;
import com.test.model.View;
import com.test.model.enums.MFFolderContentItemType;
import com.test.service.MfilesClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class Test {

    @Autowired
    MfilesClientService mfilesClientService;

    public void test() {
        List<Vault> vaults = mfilesClientService.getVaults();
        mfilesClientService.authInVault(vaults.get(0));
        FolderContentItems rootView = mfilesClientService.getRootView("/views/V172/items");
        System.out.println(rootView.getItems()[0].getObjectVersion());
        mfilesClientService.getObjectFile(rootView.getItems()[0].getObjectVersion());

        FolderContentItem folderContentItem = new FolderContentItem(MFFolderContentItemType.ViewFolder, null, null, null, new View(true, 133, "1. Documents", 0, null));

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();;
        String s = gson.toJson(folderContentItem);
        System.out.println(s);
        File file = new File("..\\test.PNG");

        mfilesClientService.createObject(0, file);

    }
}
