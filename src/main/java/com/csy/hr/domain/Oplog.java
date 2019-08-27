package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.oplog")
public class Oplog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 添加日期
     */
    @Column(name = "addDate")
    private Date adddate;

    /**
     * 操作内容
     */
    private String operate;

    /**
     * 操作员ID
     */
    private Integer hrid;

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
     * 获取添加日期
     *
     * @return addDate - 添加日期
     */
    public Date getAdddate() {
        return adddate;
    }

    /**
     * 设置添加日期
     *
     * @param adddate 添加日期
     */
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    /**
     * 获取操作内容
     *
     * @return operate - 操作内容
     */
    public String getOperate() {
        return operate;
    }

    /**
     * 设置操作内容
     *
     * @param operate 操作内容
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    /**
     * 获取操作员ID
     *
     * @return hrid - 操作员ID
     */
    public Integer getHrid() {
        return hrid;
    }

    /**
     * 设置操作员ID
     *
     * @param hrid 操作员ID
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }
}