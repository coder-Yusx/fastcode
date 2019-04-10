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
@TableName("sysPermission")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId("perId")
    private Integer perId;

    /**
     * 权限编号
     */
    @TableField("perCode")
    private String perCode;

    /**
     * 权限名称
     */
    @TableField("perName")
    private String perName;

    /**
     * 权限类型
     */
    @TableField("perType")
    private String perType;

    /**
     * 上级权限
     */
    private Integer parent;

    /**
     * 权限路径
     */
    @TableField("perPath")
    private String perPath;

    /**
     * 权限路径
     */
    @TableField("perWay")
    private String perWay;

    /**
     * 路由参数-路径
     */
    @TableField("routerPath")
    private String routerPath;

    /**
     * 路由参数-名称
     */
    @TableField("routerName")
    private String routerName;

    /**
     * 路由参数-组件
     */
    @TableField("routerComponent")
    private String routerComponent;

    /**
     * 路由参数-mate1
     */
    @TableField("routerMeta1")
    private String routerMeta1;

    /**
     * 路由参数-mate2
     */
    @TableField("routerMeta2")
    private String routerMeta2;

    /**
     * 路由参数-mate3
     */
    @TableField("routerMeta3")
    private String routerMeta3;

    /**
     * 路由参数-mate4
     */
    @TableField("routerMeta4")
    private String routerMeta4;

    /**
     * 最近修改时间
     */
    @TableField("lastModifyTime")
    private LocalDateTime lastModifyTime;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 最近修改人
     */
    @TableField("lastModifier")
    private String lastModifier;

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


    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerType() {
        return perType;
    }

    public void setPerType(String perType) {
        this.perType = perType;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getPerPath() {
        return perPath;
    }

    public void setPerPath(String perPath) {
        this.perPath = perPath;
    }

    public String getPerWay() {
        return perWay;
    }

    public void setPerWay(String perWay) {
        this.perWay = perWay;
    }

    public String getRouterPath() {
        return routerPath;
    }

    public void setRouterPath(String routerPath) {
        this.routerPath = routerPath;
    }

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public String getRouterComponent() {
        return routerComponent;
    }

    public void setRouterComponent(String routerComponent) {
        this.routerComponent = routerComponent;
    }

    public String getRouterMeta1() {
        return routerMeta1;
    }

    public void setRouterMeta1(String routerMeta1) {
        this.routerMeta1 = routerMeta1;
    }

    public String getRouterMeta2() {
        return routerMeta2;
    }

    public void setRouterMeta2(String routerMeta2) {
        this.routerMeta2 = routerMeta2;
    }

    public String getRouterMeta3() {
        return routerMeta3;
    }

    public void setRouterMeta3(String routerMeta3) {
        this.routerMeta3 = routerMeta3;
    }

    public String getRouterMeta4() {
        return routerMeta4;
    }

    public void setRouterMeta4(String routerMeta4) {
        this.routerMeta4 = routerMeta4;
    }

    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
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
        return "SysPermission{" +
        "perId=" + perId +
        ", perCode=" + perCode +
        ", perName=" + perName +
        ", perType=" + perType +
        ", parent=" + parent +
        ", perPath=" + perPath +
        ", perWay=" + perWay +
        ", routerPath=" + routerPath +
        ", routerName=" + routerName +
        ", routerComponent=" + routerComponent +
        ", routerMeta1=" + routerMeta1 +
        ", routerMeta2=" + routerMeta2 +
        ", routerMeta3=" + routerMeta3 +
        ", routerMeta4=" + routerMeta4 +
        ", lastModifyTime=" + lastModifyTime +
        ", createTime=" + createTime +
        ", creator=" + creator +
        ", lastModifier=" + lastModifier +
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
