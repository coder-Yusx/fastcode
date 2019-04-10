package com.yusx.demo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yusx
 * @since 2019-03-29
 */
@TableName("sysUser")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("userId")
    private Integer userId;

    /**
     * 用户名
     */
    @TableField("userName")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 昵称
     */
    @TableField("nickName")
    private String nickName;

    /**
     * 头像
     */
    @TableField("headPic")
    private String headPic;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册ip
     */
    @TableField("regIp")
    private String regIp;

    /**
     * 注册时间
     */
    @TableField("regTime")
    private LocalDateTime regTime;

    /**
     * 最近登录ip
     */
    @TableField("lastLoginIp")
    private String lastLoginIp;

    /**
     * 最近登录时间
     */
    @TableField("lastLoginTime")
    private LocalDateTime lastLoginTime;

    /**
     * 最近修改时间
     */
    @TableField("lastModifyTime")
    private LocalDateTime lastModifyTime;

    /**
     * 在线状态
     */
    @TableField("onlineState")
    private String onlineState;

    /**
     * 有效状态
     */
    @TableField("validateState")
    private String validateState;

    @TableField("extendVar1")
    private String extendVar1;

    @TableField("extendVar2")
    private String extendVar2;

    @TableField("extendVar3")
    private String extendVar3;

    @TableField("extendInt1")
    private Integer extendInt1;

    @TableField("extendInt2")
    private Integer extendInt2;

    @TableField("extendDouble1")
    private Double extendDouble1;

    @TableField("extendDouble2")
    private Double extendDouble2;

    @TableField("extendTime1")
    private LocalDateTime extendTime1;

    @TableField("extendTime2")
    private LocalDateTime extendTime2;

    @TableField("extendDate1")
    private LocalDate extendDate1;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(String onlineState) {
        this.onlineState = onlineState;
    }

    public String getValidateState() {
        return validateState;
    }

    public void setValidateState(String validateState) {
        this.validateState = validateState;
    }

    public String getExtendVar1() {
        return extendVar1;
    }

    public void setExtendVar1(String extendVar1) {
        this.extendVar1 = extendVar1;
    }

    public String getExtendVar2() {
        return extendVar2;
    }

    public void setExtendVar2(String extendVar2) {
        this.extendVar2 = extendVar2;
    }

    public String getExtendVar3() {
        return extendVar3;
    }

    public void setExtendVar3(String extendVar3) {
        this.extendVar3 = extendVar3;
    }

    public Integer getExtendInt1() {
        return extendInt1;
    }

    public void setExtendInt1(Integer extendInt1) {
        this.extendInt1 = extendInt1;
    }

    public Integer getExtendInt2() {
        return extendInt2;
    }

    public void setExtendInt2(Integer extendInt2) {
        this.extendInt2 = extendInt2;
    }

    public Double getExtendDouble1() {
        return extendDouble1;
    }

    public void setExtendDouble1(Double extendDouble1) {
        this.extendDouble1 = extendDouble1;
    }

    public Double getExtendDouble2() {
        return extendDouble2;
    }

    public void setExtendDouble2(Double extendDouble2) {
        this.extendDouble2 = extendDouble2;
    }

    public LocalDateTime getExtendTime1() {
        return extendTime1;
    }

    public void setExtendTime1(LocalDateTime extendTime1) {
        this.extendTime1 = extendTime1;
    }

    public LocalDateTime getExtendTime2() {
        return extendTime2;
    }

    public void setExtendTime2(LocalDateTime extendTime2) {
        this.extendTime2 = extendTime2;
    }

    public LocalDate getExtendDate1() {
        return extendDate1;
    }

    public void setExtendDate1(LocalDate extendDate1) {
        this.extendDate1 = extendDate1;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", password=" + password +
        ", salt=" + salt +
        ", nickName=" + nickName +
        ", headPic=" + headPic +
        ", mobile=" + mobile +
        ", email=" + email +
        ", regIp=" + regIp +
        ", regTime=" + regTime +
        ", lastLoginIp=" + lastLoginIp +
        ", lastLoginTime=" + lastLoginTime +
        ", lastModifyTime=" + lastModifyTime +
        ", onlineState=" + onlineState +
        ", validateState=" + validateState +
        ", extendVar1=" + extendVar1 +
        ", extendVar2=" + extendVar2 +
        ", extendVar3=" + extendVar3 +
        ", extendInt1=" + extendInt1 +
        ", extendInt2=" + extendInt2 +
        ", extendDouble1=" + extendDouble1 +
        ", extendDouble2=" + extendDouble2 +
        ", extendTime1=" + extendTime1 +
        ", extendTime2=" + extendTime2 +
        ", extendDate1=" + extendDate1 +
        "}";
    }
}
