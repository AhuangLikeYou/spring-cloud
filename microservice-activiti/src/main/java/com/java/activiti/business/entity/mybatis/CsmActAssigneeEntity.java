package com.java.activiti.business.entity.mybatis;

import java.util.Date;

public class CsmActAssigneeEntity {
    private String id;

    private String processKey;

    private String processName;

    private String elementCode;

    private String elementName;

    private String isMultiSign;

    private String assigneeCode;

    private Date updateDate;

    private String updateUser;

    private String createUser;

    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProcessKey() {
        return processKey;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey == null ? null : processKey.trim();
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode == null ? null : elementCode.trim();
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName == null ? null : elementName.trim();
    }

    public String getIsMultiSign() {
        return isMultiSign;
    }

    public void setIsMultiSign(String isMultiSign) {
        this.isMultiSign = isMultiSign == null ? null : isMultiSign.trim();
    }

    public String getAssigneeCode() {
        return assigneeCode;
    }

    public void setAssigneeCode(String assigneeCode) {
        this.assigneeCode = assigneeCode == null ? null : assigneeCode.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}