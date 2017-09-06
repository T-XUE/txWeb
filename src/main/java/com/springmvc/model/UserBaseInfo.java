package com.springmvc.model;

import java.io.Serializable;
import java.util.Date;

public class UserBaseInfo implements Serializable {
    /**
     * 主键
     * @mbggenerated
     */
    private String userBaseId;

    /**
     * 外键
     * @mbggenerated
     */
    private Long userId;

    /**
     * 用户名
     * @mbggenerated
     */
    private String userName;

    /**
     * 真实或企业名称
     * @mbggenerated
     */
    private String realName;

    /**
     * 别名
     * @mbggenerated
     */
    private String nickName;

    /**
     * 登录密码
     * @mbggenerated
     */
    private String logPassword;

    /**
     * 支付密码
     * @mbggenerated
     */
    private String payPassword;

    /**
     * 帐户ID
     * @mbggenerated
     */
    private String accountId;

    /**
     * 帐户名
     * @mbggenerated
     */
    private String accountName;

    /**
     * 联系电话
     * @mbggenerated
     */
    private String mobile;

    /**
     * 是否绑定手机
     * @mbggenerated
     */
    private String mobileBinding;

    /**
     * 联系邮箱
     * @mbggenerated
     */
    private String mail;

    /**
     * 是否绑定邮箱
     * @mbggenerated
     */
    private String mailBinding;

    /**
     * 用户类型(商户:MERCHANT 管理用户:MANAGE 个人:PERSON
     * @mbggenerated
     */
    private String type;

    /**
     * 子类型{平台账户，门店账户}
     * @mbggenerated
     */
    private String childType;

    /**
     * 用户状态
     * @mbggenerated
     */
    private String state;

    /**
     * 身份证号码
     * @mbggenerated
     */
    private String certificateCard;

    /**
     * 第一次持久化时间
     * @mbggenerated
     */
    private Date rowAddTime;

    /**
     * 最近修改时间
     * @mbggenerated
     */
    private Date rowUpdateTime;

    /**
     * 用户修改密码的时间
     * @mbggenerated
     */
    private Date passwordUpdateTime;

    /**
     * 机构号段名称
     * @mbggenerated
     */
    private String identityName;

    /**
     * 机构号段起始编号
     * @mbggenerated
     */
    private String identityStartNo;

    /**
     * 机构号段结束编号
     * @mbggenerated
     */
    private String identityEndNo;

    /**
     * 当前机构成员号
     * @mbggenerated
     */
    private String exIdentityNo;

    /**
     * 实名认证状态：IS-通过，IN-申请中,NO-未通过,N-未认证
     * @mbggenerated
     */
    private String realNameAuthentication;

    /**
     * 登录密码错误次数
     * @mbggenerated
     */
    private Integer pwdErrorCount;

    /**
     * 锁定或解锁时间
     * @mbggenerated
     */
    private Date changeLockTime;

    /**
     * 
     * @mbggenerated
     */
    private String userLevel;

    /**
     * 销售代表分配的门店信息
     * @mbggenerated
     */
    private String storeCodes;

    /**
     * 
     * @mbggenerated
     */
    private String saleCodes;

    /**
     * 省份
     * @mbggenerated
     */
    private String userProvince;

    /**
     * 城市
     * @mbggenerated
     */
    private String userCity;

    /**
     * 区/县
     * @mbggenerated
     */
    private String userCounty;

    /**
     * 企业用户，类型，小微企业，票据企业
     * @mbggenerated
     */
    private String enterpriseType;

    /**
     * 注册来源
     * @mbggenerated
     */
    private String userRegisterFrom;

    /**
     * 
     * @mbggenerated
     */
    private String userCustomType;

    /**
     * 
     * @mbggenerated
     */
    private String userCustomType1;

    /**
     * 
     * @mbggenerated
     */
    private String userCustomType2;

    /**
     * 
     * @mbggenerated
     */
    private String strUkeydn;

    /**
     * p2p用户id
     * @mbggenerated
     */
    private String p2pUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_base_info
     *
     * @mbggenerated Wed Sep 06 10:14:17 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @mbggenerated
     */
    public String getUserBaseId() {
        return userBaseId;
    }

    /**
     * 主键
     * @param userBaseId 主键
     * @mbggenerated
     */
    public void setUserBaseId(String userBaseId) {
        this.userBaseId = userBaseId == null ? null : userBaseId.trim();
    }

    /**
     * 外键
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 外键
     * @param userId 外键
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 真实或企业名称
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实或企业名称
     * @param realName 真实或企业名称
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 别名
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 别名
     * @param nickName 别名
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 登录密码
     * @mbggenerated
     */
    public String getLogPassword() {
        return logPassword;
    }

    /**
     * 登录密码
     * @param logPassword 登录密码
     * @mbggenerated
     */
    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword == null ? null : logPassword.trim();
    }

    /**
     * 支付密码
     * @mbggenerated
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 支付密码
     * @param payPassword 支付密码
     * @mbggenerated
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     * 帐户ID
     * @mbggenerated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 帐户ID
     * @param accountId 帐户ID
     * @mbggenerated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 帐户名
     * @mbggenerated
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 帐户名
     * @param accountName 帐户名
     * @mbggenerated
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * 联系电话
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 联系电话
     * @param mobile 联系电话
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 是否绑定手机
     * @mbggenerated
     */
    public String getMobileBinding() {
        return mobileBinding;
    }

    /**
     * 是否绑定手机
     * @param mobileBinding 是否绑定手机
     * @mbggenerated
     */
    public void setMobileBinding(String mobileBinding) {
        this.mobileBinding = mobileBinding == null ? null : mobileBinding.trim();
    }

    /**
     * 联系邮箱
     * @mbggenerated
     */
    public String getMail() {
        return mail;
    }

    /**
     * 联系邮箱
     * @param mail 联系邮箱
     * @mbggenerated
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 是否绑定邮箱
     * @mbggenerated
     */
    public String getMailBinding() {
        return mailBinding;
    }

    /**
     * 是否绑定邮箱
     * @param mailBinding 是否绑定邮箱
     * @mbggenerated
     */
    public void setMailBinding(String mailBinding) {
        this.mailBinding = mailBinding == null ? null : mailBinding.trim();
    }

    /**
     * 用户类型(商户:MERCHANT 管理用户:MANAGE 个人:PERSON
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * 用户类型(商户:MERCHANT 管理用户:MANAGE 个人:PERSON
     * @param type 用户类型(商户:MERCHANT 管理用户:MANAGE 个人:PERSON
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 子类型{平台账户，门店账户}
     * @mbggenerated
     */
    public String getChildType() {
        return childType;
    }

    /**
     * 子类型{平台账户，门店账户}
     * @param childType 子类型{平台账户，门店账户}
     * @mbggenerated
     */
    public void setChildType(String childType) {
        this.childType = childType == null ? null : childType.trim();
    }

    /**
     * 用户状态
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * 用户状态
     * @param state 用户状态
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 身份证号码
     * @mbggenerated
     */
    public String getCertificateCard() {
        return certificateCard;
    }

    /**
     * 身份证号码
     * @param certificateCard 身份证号码
     * @mbggenerated
     */
    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard == null ? null : certificateCard.trim();
    }

    /**
     * 第一次持久化时间
     * @mbggenerated
     */
    public Date getRowAddTime() {
        return rowAddTime;
    }

    /**
     * 第一次持久化时间
     * @param rowAddTime 第一次持久化时间
     * @mbggenerated
     */
    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    /**
     * 最近修改时间
     * @mbggenerated
     */
    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    /**
     * 最近修改时间
     * @param rowUpdateTime 最近修改时间
     * @mbggenerated
     */
    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    /**
     * 用户修改密码的时间
     * @mbggenerated
     */
    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    /**
     * 用户修改密码的时间
     * @param passwordUpdateTime 用户修改密码的时间
     * @mbggenerated
     */
    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    /**
     * 机构号段名称
     * @mbggenerated
     */
    public String getIdentityName() {
        return identityName;
    }

    /**
     * 机构号段名称
     * @param identityName 机构号段名称
     * @mbggenerated
     */
    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    /**
     * 机构号段起始编号
     * @mbggenerated
     */
    public String getIdentityStartNo() {
        return identityStartNo;
    }

    /**
     * 机构号段起始编号
     * @param identityStartNo 机构号段起始编号
     * @mbggenerated
     */
    public void setIdentityStartNo(String identityStartNo) {
        this.identityStartNo = identityStartNo == null ? null : identityStartNo.trim();
    }

    /**
     * 机构号段结束编号
     * @mbggenerated
     */
    public String getIdentityEndNo() {
        return identityEndNo;
    }

    /**
     * 机构号段结束编号
     * @param identityEndNo 机构号段结束编号
     * @mbggenerated
     */
    public void setIdentityEndNo(String identityEndNo) {
        this.identityEndNo = identityEndNo == null ? null : identityEndNo.trim();
    }

    /**
     * 当前机构成员号
     * @mbggenerated
     */
    public String getExIdentityNo() {
        return exIdentityNo;
    }

    /**
     * 当前机构成员号
     * @param exIdentityNo 当前机构成员号
     * @mbggenerated
     */
    public void setExIdentityNo(String exIdentityNo) {
        this.exIdentityNo = exIdentityNo == null ? null : exIdentityNo.trim();
    }

    /**
     * 实名认证状态：IS-通过，IN-申请中,NO-未通过,N-未认证
     * @mbggenerated
     */
    public String getRealNameAuthentication() {
        return realNameAuthentication;
    }

    /**
     * 实名认证状态：IS-通过，IN-申请中,NO-未通过,N-未认证
     * @param realNameAuthentication 实名认证状态：IS-通过，IN-申请中,NO-未通过,N-未认证
     * @mbggenerated
     */
    public void setRealNameAuthentication(String realNameAuthentication) {
        this.realNameAuthentication = realNameAuthentication == null ? null : realNameAuthentication.trim();
    }

    /**
     * 登录密码错误次数
     * @mbggenerated
     */
    public Integer getPwdErrorCount() {
        return pwdErrorCount;
    }

    /**
     * 登录密码错误次数
     * @param pwdErrorCount 登录密码错误次数
     * @mbggenerated
     */
    public void setPwdErrorCount(Integer pwdErrorCount) {
        this.pwdErrorCount = pwdErrorCount;
    }

    /**
     * 锁定或解锁时间
     * @mbggenerated
     */
    public Date getChangeLockTime() {
        return changeLockTime;
    }

    /**
     * 锁定或解锁时间
     * @param changeLockTime 锁定或解锁时间
     * @mbggenerated
     */
    public void setChangeLockTime(Date changeLockTime) {
        this.changeLockTime = changeLockTime;
    }

    /**
     * 
     * @mbggenerated
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 
     * @param userLevel 
     * @mbggenerated
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    /**
     * 销售代表分配的门店信息
     * @mbggenerated
     */
    public String getStoreCodes() {
        return storeCodes;
    }

    /**
     * 销售代表分配的门店信息
     * @param storeCodes 销售代表分配的门店信息
     * @mbggenerated
     */
    public void setStoreCodes(String storeCodes) {
        this.storeCodes = storeCodes == null ? null : storeCodes.trim();
    }

    /**
     * 
     * @mbggenerated
     */
    public String getSaleCodes() {
        return saleCodes;
    }

    /**
     * 
     * @param saleCodes 
     * @mbggenerated
     */
    public void setSaleCodes(String saleCodes) {
        this.saleCodes = saleCodes == null ? null : saleCodes.trim();
    }

    /**
     * 省份
     * @mbggenerated
     */
    public String getUserProvince() {
        return userProvince;
    }

    /**
     * 省份
     * @param userProvince 省份
     * @mbggenerated
     */
    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    /**
     * 城市
     * @mbggenerated
     */
    public String getUserCity() {
        return userCity;
    }

    /**
     * 城市
     * @param userCity 城市
     * @mbggenerated
     */
    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    /**
     * 区/县
     * @mbggenerated
     */
    public String getUserCounty() {
        return userCounty;
    }

    /**
     * 区/县
     * @param userCounty 区/县
     * @mbggenerated
     */
    public void setUserCounty(String userCounty) {
        this.userCounty = userCounty == null ? null : userCounty.trim();
    }

    /**
     * 企业用户，类型，小微企业，票据企业
     * @mbggenerated
     */
    public String getEnterpriseType() {
        return enterpriseType;
    }

    /**
     * 企业用户，类型，小微企业，票据企业
     * @param enterpriseType 企业用户，类型，小微企业，票据企业
     * @mbggenerated
     */
    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    /**
     * 注册来源
     * @mbggenerated
     */
    public String getUserRegisterFrom() {
        return userRegisterFrom;
    }

    /**
     * 注册来源
     * @param userRegisterFrom 注册来源
     * @mbggenerated
     */
    public void setUserRegisterFrom(String userRegisterFrom) {
        this.userRegisterFrom = userRegisterFrom == null ? null : userRegisterFrom.trim();
    }

    /**
     * 
     * @mbggenerated
     */
    public String getUserCustomType() {
        return userCustomType;
    }

    /**
     * 
     * @param userCustomType 
     * @mbggenerated
     */
    public void setUserCustomType(String userCustomType) {
        this.userCustomType = userCustomType == null ? null : userCustomType.trim();
    }

    /**
     * 
     * @mbggenerated
     */
    public String getUserCustomType1() {
        return userCustomType1;
    }

    /**
     * 
     * @param userCustomType1 
     * @mbggenerated
     */
    public void setUserCustomType1(String userCustomType1) {
        this.userCustomType1 = userCustomType1 == null ? null : userCustomType1.trim();
    }

    /**
     * 
     * @mbggenerated
     */
    public String getUserCustomType2() {
        return userCustomType2;
    }

    /**
     * 
     * @param userCustomType2 
     * @mbggenerated
     */
    public void setUserCustomType2(String userCustomType2) {
        this.userCustomType2 = userCustomType2 == null ? null : userCustomType2.trim();
    }

    /**
     * 
     * @mbggenerated
     */
    public String getStrUkeydn() {
        return strUkeydn;
    }

    /**
     * 
     * @param strUkeydn 
     * @mbggenerated
     */
    public void setStrUkeydn(String strUkeydn) {
        this.strUkeydn = strUkeydn == null ? null : strUkeydn.trim();
    }

    /**
     * p2p用户id
     * @mbggenerated
     */
    public String getP2pUserId() {
        return p2pUserId;
    }

    /**
     * p2p用户id
     * @param p2pUserId p2p用户id
     * @mbggenerated
     */
    public void setP2pUserId(String p2pUserId) {
        this.p2pUserId = p2pUserId == null ? null : p2pUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbggenerated Wed Sep 06 10:14:17 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userBaseId=").append(userBaseId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", realName=").append(realName);
        sb.append(", nickName=").append(nickName);
        sb.append(", logPassword=").append(logPassword);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileBinding=").append(mobileBinding);
        sb.append(", mail=").append(mail);
        sb.append(", mailBinding=").append(mailBinding);
        sb.append(", type=").append(type);
        sb.append(", childType=").append(childType);
        sb.append(", state=").append(state);
        sb.append(", certificateCard=").append(certificateCard);
        sb.append(", rowAddTime=").append(rowAddTime);
        sb.append(", rowUpdateTime=").append(rowUpdateTime);
        sb.append(", passwordUpdateTime=").append(passwordUpdateTime);
        sb.append(", identityName=").append(identityName);
        sb.append(", identityStartNo=").append(identityStartNo);
        sb.append(", identityEndNo=").append(identityEndNo);
        sb.append(", exIdentityNo=").append(exIdentityNo);
        sb.append(", realNameAuthentication=").append(realNameAuthentication);
        sb.append(", pwdErrorCount=").append(pwdErrorCount);
        sb.append(", changeLockTime=").append(changeLockTime);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", storeCodes=").append(storeCodes);
        sb.append(", saleCodes=").append(saleCodes);
        sb.append(", userProvince=").append(userProvince);
        sb.append(", userCity=").append(userCity);
        sb.append(", userCounty=").append(userCounty);
        sb.append(", enterpriseType=").append(enterpriseType);
        sb.append(", userRegisterFrom=").append(userRegisterFrom);
        sb.append(", userCustomType=").append(userCustomType);
        sb.append(", userCustomType1=").append(userCustomType1);
        sb.append(", userCustomType2=").append(userCustomType2);
        sb.append(", strUkeydn=").append(strUkeydn);
        sb.append(", p2pUserId=").append(p2pUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}