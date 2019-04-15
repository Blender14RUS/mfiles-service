package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SessionInfo {
    private String accountName;
    private int ACLMode;
    private int authenticationType;
    private boolean canForceUndoCheckout;
    private boolean canManageCommonUISettings;
    private boolean canManageCommonViews;
    private boolean canManageTraditionalFolders;
    private boolean canMaterializeViews;
    private boolean canSeeAllObjects;
    private boolean canSeeDeletedObjects;
    private boolean internalUser;
    private boolean licenseAllowsModifications;
    private int userID;
}
