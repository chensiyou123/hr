package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.employeetrain")
public class Employeetrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 培训日期
     */
    @Column(name = "trainDate")
    private Date traindate;

    /**
     * 培训内容
     */
    @Column(name = "trainContent")
    private String traincontent;

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
     * 获取培训日期
     *
     * @return trainDate - 培训日期
     */
    public Date getTraindate() {
        return traindate;
    }

    /**
     * 设置培训日期
     *
     * @param traindate 培训日期
     */
    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    /**
     * 获取培训内容
     *
     * @return trainContent - 培训内容
     */
    public String getTraincontent() {
        return traincontent;
    }

    /**
     * 设置培训内容
     *
     * @param traincontent 培训内容
     */
    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent;
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