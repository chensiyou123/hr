package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.joblevel")
public class Joblevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    @Column(name = "titleLevel")
    private String titlelevel;

    @Column(name = "createDate")
    private Date createdate;

    private Boolean enabled;

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
     * 获取职称名称
     *
     * @return name - 职称名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置职称名称
     *
     * @param name 职称名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return titleLevel
     */
    public String getTitlelevel() {
        return titlelevel;
    }

    /**
     * @param titlelevel
     */
    public void setTitlelevel(String titlelevel) {
        this.titlelevel = titlelevel;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}