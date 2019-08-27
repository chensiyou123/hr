package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.salary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 基本工资
     */
    @Column(name = "basicSalary")
    private Integer basicsalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    @Column(name = "lunchSalary")
    private Integer lunchsalary;

    /**
     * 交通补助
     */
    @Column(name = "trafficSalary")
    private Integer trafficsalary;

    /**
     * 应发工资
     */
    @Column(name = "allSalary")
    private Integer allsalary;

    /**
     * 养老金基数
     */
    @Column(name = "pensionBase")
    private Integer pensionbase;

    /**
     * 养老金比率
     */
    @Column(name = "pensionPer")
    private Float pensionper;

    /**
     * 启用时间
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 医疗基数
     */
    @Column(name = "medicalBase")
    private Integer medicalbase;

    /**
     * 医疗保险比率
     */
    @Column(name = "medicalPer")
    private Float medicalper;

    /**
     * 公积金基数
     */
    @Column(name = "accumulationFundBase")
    private Integer accumulationfundbase;

    /**
     * 公积金比率
     */
    @Column(name = "accumulationFundPer")
    private Float accumulationfundper;

    private String name;

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
     * 获取基本工资
     *
     * @return basicSalary - 基本工资
     */
    public Integer getBasicsalary() {
        return basicsalary;
    }

    /**
     * 设置基本工资
     *
     * @param basicsalary 基本工资
     */
    public void setBasicsalary(Integer basicsalary) {
        this.basicsalary = basicsalary;
    }

    /**
     * 获取奖金
     *
     * @return bonus - 奖金
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置奖金
     *
     * @param bonus 奖金
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取午餐补助
     *
     * @return lunchSalary - 午餐补助
     */
    public Integer getLunchsalary() {
        return lunchsalary;
    }

    /**
     * 设置午餐补助
     *
     * @param lunchsalary 午餐补助
     */
    public void setLunchsalary(Integer lunchsalary) {
        this.lunchsalary = lunchsalary;
    }

    /**
     * 获取交通补助
     *
     * @return trafficSalary - 交通补助
     */
    public Integer getTrafficsalary() {
        return trafficsalary;
    }

    /**
     * 设置交通补助
     *
     * @param trafficsalary 交通补助
     */
    public void setTrafficsalary(Integer trafficsalary) {
        this.trafficsalary = trafficsalary;
    }

    /**
     * 获取应发工资
     *
     * @return allSalary - 应发工资
     */
    public Integer getAllsalary() {
        return allsalary;
    }

    /**
     * 设置应发工资
     *
     * @param allsalary 应发工资
     */
    public void setAllsalary(Integer allsalary) {
        this.allsalary = allsalary;
    }

    /**
     * 获取养老金基数
     *
     * @return pensionBase - 养老金基数
     */
    public Integer getPensionbase() {
        return pensionbase;
    }

    /**
     * 设置养老金基数
     *
     * @param pensionbase 养老金基数
     */
    public void setPensionbase(Integer pensionbase) {
        this.pensionbase = pensionbase;
    }

    /**
     * 获取养老金比率
     *
     * @return pensionPer - 养老金比率
     */
    public Float getPensionper() {
        return pensionper;
    }

    /**
     * 设置养老金比率
     *
     * @param pensionper 养老金比率
     */
    public void setPensionper(Float pensionper) {
        this.pensionper = pensionper;
    }

    /**
     * 获取启用时间
     *
     * @return createDate - 启用时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置启用时间
     *
     * @param createdate 启用时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取医疗基数
     *
     * @return medicalBase - 医疗基数
     */
    public Integer getMedicalbase() {
        return medicalbase;
    }

    /**
     * 设置医疗基数
     *
     * @param medicalbase 医疗基数
     */
    public void setMedicalbase(Integer medicalbase) {
        this.medicalbase = medicalbase;
    }

    /**
     * 获取医疗保险比率
     *
     * @return medicalPer - 医疗保险比率
     */
    public Float getMedicalper() {
        return medicalper;
    }

    /**
     * 设置医疗保险比率
     *
     * @param medicalper 医疗保险比率
     */
    public void setMedicalper(Float medicalper) {
        this.medicalper = medicalper;
    }

    /**
     * 获取公积金基数
     *
     * @return accumulationFundBase - 公积金基数
     */
    public Integer getAccumulationfundbase() {
        return accumulationfundbase;
    }

    /**
     * 设置公积金基数
     *
     * @param accumulationfundbase 公积金基数
     */
    public void setAccumulationfundbase(Integer accumulationfundbase) {
        this.accumulationfundbase = accumulationfundbase;
    }

    /**
     * 获取公积金比率
     *
     * @return accumulationFundPer - 公积金比率
     */
    public Float getAccumulationfundper() {
        return accumulationfundper;
    }

    /**
     * 设置公积金比率
     *
     * @param accumulationfundper 公积金比率
     */
    public void setAccumulationfundper(Float accumulationfundper) {
        this.accumulationfundper = accumulationfundper;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}