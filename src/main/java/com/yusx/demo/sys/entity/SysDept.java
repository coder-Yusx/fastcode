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
@TableName("sysDept")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     */
    @TableId("deptId")
    private Integer deptId;

    /**
     * 部门名称
     */
    @TableField("deptName")
    private String deptName;

    /**
     * 部门描述
     */
    @TableField("deptDiscribion")
    private String deptDiscribion;

    /**
     * 部门类型
     */
    @TableField("deptType")
    private String deptType;

    /**
     * 上级部门
     */
    private Integer parent;

    /**
     * 有效状态
     */
    @TableField("validateState")
    private String validateState;

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
     * 最近修改时间
     */
    @TableField("lastModifyTime")
    private LocalDateTime lastModifyTime;

    /**
     * 最近修改人
     */
    @TableField("lastModifier")
    private String lastModifier;

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


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDiscribion() {
        return deptDiscribion;
    }

    public void setDeptDiscribion(String deptDiscribion) {
        this.deptDiscribion = deptDiscribion;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getValidateState() {
        return validateState;
    }

    public void setValidateState(String validateState) {
        this.validateState = validateState;
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

    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
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
        return "SysDept{" +
        "deptId=" + deptId +
        ", deptName=" + deptName +
        ", deptDiscribion=" + deptDiscribion +
        ", deptType=" + deptType +
        ", parent=" + parent +
        ", validateState=" + validateState +
        ", createTime=" + createTime +
        ", creator=" + creator +
        ", lastModifyTime=" + lastModifyTime +
        ", lastModifier=" + lastModifier +
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
