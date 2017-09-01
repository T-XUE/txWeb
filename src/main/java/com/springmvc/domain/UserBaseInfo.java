package com.springmvc.domain;
import java.util.Date;

public class UserBaseInfo {
    private String userBaseId;

    private Long userId;

    private String userName;

    private String realName;

    private String nickName;

    private String logPassword;

    private String payPassword;

    private String accountId;

    private String accountName;

    private String mobile;

    private String mobileBinding;

    private String mail;

    private String mailBinding;

    private String type;

    private String childType;

    private String state;

    private String certificateCard;

    private Date rowAddTime;

    private Date rowUpdateTime;

    private Date passwordUpdateTime;

    private String identityName;

    private String identityStartNo;

    private String identityEndNo;

    private String exIdentityNo;

    private String realNameAuthentication;

    private Integer pwdErrorCount;

    private Date changeLockTime;

    private String userLevel;

    private String storeCodes;

    private String saleCodes;

    private String userProvince;

    private String userCity;

    private String userCounty;

    private String enterpriseType;

    private String userRegisterFrom;

    private String userCustomType;

    private String userCustomType1;

    private String userCustomType2;

    private String strUkeydn;

    private String p2pUserId;

    public String getUserBaseId() {
        return userBaseId;
    }

    public void setUserBaseId(String userBaseId) {
        this.userBaseId = userBaseId == null ? null : userBaseId.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword == null ? null : logPassword.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobileBinding() {
        return mobileBinding;
    }

    public void setMobileBinding(String mobileBinding) {
        this.mobileBinding = mobileBinding == null ? null : mobileBinding.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMailBinding() {
        return mailBinding;
    }

    public void setMailBinding(String mailBinding) {
        this.mailBinding = mailBinding == null ? null : mailBinding.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getChildType() {
        return childType;
    }

    public void setChildType(String childType) {
        this.childType = childType == null ? null : childType.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard == null ? null : certificateCard.trim();
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    public String getIdentityStartNo() {
        return identityStartNo;
    }

    public void setIdentityStartNo(String identityStartNo) {
        this.identityStartNo = identityStartNo == null ? null : identityStartNo.trim();
    }

    public String getIdentityEndNo() {
        return identityEndNo;
    }

    public void setIdentityEndNo(String identityEndNo) {
        this.identityEndNo = identityEndNo == null ? null : identityEndNo.trim();
    }

    public String getExIdentityNo() {
        return exIdentityNo;
    }

    public void setExIdentityNo(String exIdentityNo) {
        this.exIdentityNo = exIdentityNo == null ? null : exIdentityNo.trim();
    }

    public String getRealNameAuthentication() {
        return realNameAuthentication;
    }

    public void setRealNameAuthentication(String realNameAuthentication) {
        this.realNameAuthentication = realNameAuthentication == null ? null : realNameAuthentication.trim();
    }

    public Integer getPwdErrorCount() {
        return pwdErrorCount;
    }

    public void setPwdErrorCount(Integer pwdErrorCount) {
        this.pwdErrorCount = pwdErrorCount;
    }

    public Date getChangeLockTime() {
        return changeLockTime;
    }

    public void setChangeLockTime(Date changeLockTime) {
        this.changeLockTime = changeLockTime;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public String getStoreCodes() {
        return storeCodes;
    }

    public void setStoreCodes(String storeCodes) {
        this.storeCodes = storeCodes == null ? null : storeCodes.trim();
    }

    public String getSaleCodes() {
        return saleCodes;
    }

    public void setSaleCodes(String saleCodes) {
        this.saleCodes = saleCodes == null ? null : saleCodes.trim();
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserCounty() {
        return userCounty;
    }

    public void setUserCounty(String userCounty) {
        this.userCounty = userCounty == null ? null : userCounty.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getUserRegisterFrom() {
        return userRegisterFrom;
    }

    public void setUserRegisterFrom(String userRegisterFrom) {
        this.userRegisterFrom = userRegisterFrom == null ? null : userRegisterFrom.trim();
    }

    public String getUserCustomType() {
        return userCustomType;
    }

    public void setUserCustomType(String userCustomType) {
        this.userCustomType = userCustomType == null ? null : userCustomType.trim();
    }

    public String getUserCustomType1() {
        return userCustomType1;
    }

    public void setUserCustomType1(String userCustomType1) {
        this.userCustomType1 = userCustomType1 == null ? null : userCustomType1.trim();
    }

    public String getUserCustomType2() {
        return userCustomType2;
    }

    public void setUserCustomType2(String userCustomType2) {
        this.userCustomType2 = userCustomType2 == null ? null : userCustomType2.trim();
    }

    public String getStrUkeydn() {
        return strUkeydn;
    }

    public void setStrUkeydn(String strUkeydn) {
        this.strUkeydn = strUkeydn == null ? null : strUkeydn.trim();
    }

    public String getP2pUserId() {
        return p2pUserId;
    }

    public void setP2pUserId(String p2pUserId) {
        this.p2pUserId = p2pUserId == null ? null : p2pUserId.trim();
    }
}