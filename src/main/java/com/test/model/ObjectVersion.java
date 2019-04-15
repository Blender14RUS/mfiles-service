package com.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjectVersion {
    private String accessedByMeUtc;
    private String checkedOutAtUtc;
    private int checkedOutTo;
    private String checkedOutToUserName;
    private int Classs;
    private String createdUtc;
    private boolean deleted;
    private String displayID;
    private ObjectFile[] files;
    private boolean hasAssignments;
    private boolean hasRelationshipsFromThis;
    private boolean hasRelationshipsToThis;
    private boolean isStub;
    private String lastModifiedUtc;
    private boolean objectCheckedOut;
    private boolean objectCheckedOutToThisUser;
    private int objectVersionFlags;
    private ObjVer objVer;
    private boolean singleFile;
    private boolean thisVersionLatestToThisUser;
    private String title;
    private boolean visibleAfterOperation;
}
