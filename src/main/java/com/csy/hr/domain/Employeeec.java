package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.employeeec")
public class Employeeec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 奖罚日期
     */
    @Column(name = "ecDate")
    private Date ecdate;

    /**
     * 奖罚原因
     */
    @Column(name = "ecReason")
    private String ecreason;

    /**
     * 奖罚分
     */
    @Column(name = "ecPoint")
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    @Column(name = "ecType")
    private Integer ectype;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取员工编号
     *
     * @return eid - 员工编号
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 设置员工编号
     *
     * @param eid 员工编号
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 获取奖罚日期
     *
     * @return ecDate - 奖罚日期
     */
    public Date getEcdate() {
        return ecdate;
    }

    /**
     * 设置奖罚日期
     *
     * @param ecdate 奖罚日期
     */
    public void setEcdate(Date ecdate) {
        this.ecdate = ecdate;
    }

    /**
     * 获取奖罚原因
     *
     * @return ecReason - 奖罚原因
     */
    public String getEcreason() {
        return ecreason;
    }

    /**
     * 设置奖罚原因
     *
     * @param ecreason 奖罚原因
     */
    public void setEcreason(String ecreason) {
        this.ecreason = ecreason;
    }

    /**
     * 获取奖罚分
     *
     * @return ecPoint - 奖罚分
     */
    public Integer getEcpoint() {
        return ecpoint;
    }

    /**
     * 设置奖罚分
     *
     * @param ecpoint 奖罚分
     */
    public void setEcpoint(Integer ecpoint) {
        this.ecpoint = ecpoint;
    }

    /**
     * 获取奖罚类别，0：奖，1：罚
     *
     * @return ecType - 奖罚类别，0：奖，1：罚
     */
    public Integer getEctype() {
        return ectype;
    }

    /**
     * 设置奖罚类别，0：奖，1：罚
     *
     * @param ectype 奖罚类别，0：奖，1：罚
     */
    public void setEctype(Integer ectype) {
        this.ectype = ectype;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}