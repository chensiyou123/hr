package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.employeeremove")
public class Employeeremove {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eid;

    /**
     * 调动后部门
     */
    @Column(name = "afterDepId")
    private Integer afterdepid;

    /**
     * 调动后职位
     */
    @Column(name = "afterJobId")
    private Integer afterjobid;

    /**
     * 调动日期
     */
    @Column(name = "removeDate")
    private Date removedate;

    /**
     * 调动原因
     */
    private String reason;

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
     * 获取调动后部门
     *
     * @return afterDepId - 调动后部门
     */
    public Integer getAfterdepid() {
        return afterdepid;
    }

    /**
     * 设置调动后部门
     *
     * @param afterdepid 调动后部门
     */
    public void setAfterdepid(Integer afterdepid) {
        this.afterdepid = afterdepid;
    }

    /**
     * 获取调动后职位
     *
     * @return afterJobId - 调动后职位
     */
    public Integer getAfterjobid() {
        return afterjobid;
    }

    /**
     * 设置调动后职位
     *
     * @param afterjobid 调动后职位
     */
    public void setAfterjobid(Integer afterjobid) {
        this.afterjobid = afterjobid;
    }

    /**
     * 获取调动日期
     *
     * @return removeDate - 调动日期
     */
    public Date getRemovedate() {
        return removedate;
    }

    /**
     * 设置调动日期
     *
     * @param removedate 调动日期
     */
    public void setRemovedate(Date removedate) {
        this.removedate = removedate;
    }

    /**
     * 获取调动原因
     *
     * @return reason - 调动原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置调动原因
     *
     * @param reason 调动原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}