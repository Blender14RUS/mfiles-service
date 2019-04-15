package com.test.service;

import com.test.model.FolderContentItems;
import com.test.model.ObjectVersion;
import com.test.model.Vault;

import java.io.File;
import java.util.List;

public interface MfilesClientService {

    FolderContentItems getRootView(String path);

    List<Vault> getVaults();

    void authInVault(Vault vault);

    void getObjectFile(ObjectVersion objectVersion);

    void createObject(int type, File file);
}
