package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.appraise")
public class Appraise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eid;

    /**
     * 考评日期
     */
    @Column(name = "appDate")
    private Date appdate;

    /**
     * 考评结果
     */
    @Column(name = "appResult")
    private String appresult;

    /**
     * 考评内容
     */
    @Column(name = "appContent")
    private String appcontent;

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
     * @return eid
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * @param eid
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 获取考评日期
     *
     * @return appDate - 考评日期
     */
    public Date getAppdate() {
        return appdate;
    }

    /**
     * 设置考评日期
     *
     * @param appdate 考评日期
     */
    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    /**
     * 获取考评结果
     *
     * @return appResult - 考评结果
     */
    public String getAppresult() {
        return appresult;
    }

    /**
     * 设置考评结果
     *
     * @param appresult 考评结果
     */
    public void setAppresult(String appresult) {
        this.appresult = appresult;
    }

    /**
     * 获取考评内容
     *
     * @return appContent - 考评内容
     */
    public String getAppcontent() {
        return appcontent;
    }

    /**
     * 设置考评内容
     *
     * @param appcontent 考评内容
     */
    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent;
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