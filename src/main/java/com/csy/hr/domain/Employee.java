package com.csy.hr.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vhr.employee")
public class Employee {
    /**
     * 员工编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 婚姻状况
     */
    private String wedlock;

    /**
     * 民族
     */
    @Column(name = "nationId")
    private Integer nationid;

    /**
     * 籍贯
     */
    @Column(name = "nativePlace")
    private String nativeplace;

    /**
     * 政治面貌
     */
    @Column(name = "politicId")
    private Integer politicid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门
     */
    @Column(name = "departmentId")
    private Integer departmentid;

    /**
     * 职称ID
     */
    @Column(name = "jobLevelId")
    private Integer joblevelid;

    /**
     * 职位ID
     */
    @Column(name = "posId")
    private Integer posid;

    /**
     * 聘用形式
     */
    @Column(name = "engageForm")
    private String engageform;

    /**
     * 最高学历
     */
    @Column(name = "tiptopDegree")
    private String tiptopdegree;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 入职日期
     */
    @Column(name = "beginDate")
    private Date begindate;

    /**
     * 在职状态
     */
    @Column(name = "workState")
    private String workstate;

    /**
     * 工号
     */
    @Column(name = "workID")
    private String workid;

    /**
     * 合同期限
     */
    @Column(name = "contractTerm")
    private Double contractterm;

    /**
     * 转正日期
     */
    @Column(name = "conversionTime")
    private Date conversiontime;

    /**
     * 离职日期
     */
    @Column(name = "notWorkDate")
    private Date notworkdate;

    /**
     * 合同起始日期
     */
    @Column(name = "beginContract")
    private Date begincontract;

    /**
     * 合同终止日期
     */
    @Column(name = "endContract")
    private Date endcontract;

    /**
     * 工龄
     */
    @Column(name = "workAge")
    private Integer workage;

    /**
     * 获取员工编号
     *
     * @return id - 员工编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置员工编号
     *
     * @param id 员工编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取员工姓名
     *
     * @return name - 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工姓名
     *
     * @param name 员工姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取身份证号
     *
     * @return idCard - 身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号
     *
     * @param idcard 身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取婚姻状况
     *
     * @return wedlock - 婚姻状况
     */
    public String getWedlock() {
        return wedlock;
    }

    /**
     * 设置婚姻状况
     *
     * @param wedlock 婚姻状况
     */
    public void setWedlock(String wedlock) {
        this.wedlock = wedlock;
    }

    /**
     * 获取民族
     *
     * @return nationId - 民族
     */
    public Integer getNationid() {
        return nationid;
    }

    /**
     * 设置民族
     *
     * @param nationid 民族
     */
    public void setNationid(Integer nationid) {
        this.nationid = nationid;
    }

    /**
     * 获取籍贯
     *
     * @return nativePlace - 籍贯
     */
    public String getNativeplace() {
        return nativeplace;
    }

    /**
     * 设置籍贯
     *
     * @param nativeplace 籍贯
     */
    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    /**
     * 获取政治面貌
     *
     * @return politicId - 政治面貌
     */
    public Integer getPoliticid() {
        return politicid;
    }

    /**
     * 设置政治面貌
     *
     * @param politicid 政治面貌
     */
    public void setPoliticid(Integer politicid) {
        this.politicid = politicid;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取联系地址
     *
     * @return address - 联系地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置联系地址
     *
     * @param address 联系地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取所属部门
     *
     * @return departmentId - 所属部门
     */
    public Integer getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置所属部门
     *
     * @param departmentid 所属部门
     */
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 获取职称ID
     *
     * @return jobLevelId - 职称ID
     */
    public Integer getJoblevelid() {
        return joblevelid;
    }

    /**
     * 设置职称ID
     *
     * @param joblevelid 职称ID
     */
    public void setJoblevelid(Integer joblevelid) {
        this.joblevelid = joblevelid;
    }

    /**
     * 获取职位ID
     *
     * @return posId - 职位ID
     */
    public Integer getPosid() {
        return posid;
    }

    /**
     * 设置职位ID
     *
     * @param posid 职位ID
     */
    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    /**
     * 获取聘用形式
     *
     * @return engageForm - 聘用形式
     */
    public String getEngageform() {
        return engageform;
    }

    /**
     * 设置聘用形式
     *
     * @param engageform 聘用形式
     */
    public void setEngageform(String engageform) {
        this.engageform = engageform;
    }

    /**
     * 获取最高学历
     *
     * @return tiptopDegree - 最高学历
     */
    public String getTiptopdegree() {
        return tiptopdegree;
    }

    /**
     * 设置最高学历
     *
     * @param tiptopdegree 最高学历
     */
    public void setTiptopdegree(String tiptopdegree) {
        this.tiptopdegree = tiptopdegree;
    }

    /**
     * 获取所属专业
     *
     * @return specialty - 所属专业
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 设置所属专业
     *
     * @param specialty 所属专业
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * 获取毕业院校
     *
     * @return school - 毕业院校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置毕业院校
     *
     * @param school 毕业院校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取入职日期
     *
     * @return beginDate - 入职日期
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * 设置入职日期
     *
     * @param begindate 入职日期
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
     * 获取在职状态
     *
     * @return workState - 在职状态
     */
    public String getWorkstate() {
        return workstate;
    }

    /**
     * 设置在职状态
     *
     * @param workstate 在职状态
     */
    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    /**
     * 获取工号
     *
     * @return workID - 工号
     */
    public String getWorkid() {
        return workid;
    }

    /**
     * 设置工号
     *
     * @param workid 工号
     */
    public void setWorkid(String workid) {
        this.workid = workid;
    }

    /**
     * 获取合同期限
     *
     * @return contractTerm - 合同期限
     */
    public Double getContractterm() {
        return contractterm;
    }

    /**
     * 设置合同期限
     *
     * @param contractterm 合同期限
     */
    public void setContractterm(Double contractterm) {
        this.contractterm = contractterm;
    }

    /**
     * 获取转正日期
     *
     * @return conversionTime - 转正日期
     */
    public Date getConversiontime() {
        return conversiontime;
    }

    /**
     * 设置转正日期
     *
     * @param conversiontime 转正日期
     */
    public void setConversiontime(Date conversiontime) {
        this.conversiontime = conversiontime;
    }

    /**
     * 获取离职日期
     *
     * @return notWorkDate - 离职日期
     */
    public Date getNotworkdate() {
        return notworkdate;
    }

    /**
     * 设置离职日期
     *
     * @param notworkdate 离职日期
     */
    public void setNotworkdate(Date notworkdate) {
        this.notworkdate = notworkdate;
    }

    /**
     * 获取合同起始日期
     *
     * @return beginContract - 合同起始日期
     */
    public Date getBegincontract() {
        return begincontract;
    }

    /**
     * 设置合同起始日期
     *
     * @param begincontract 合同起始日期
     */
    public void setBegincontract(Date begincontract) {
        this.begincontract = begincontract;
    }

    /**
     * 获取合同终止日期
     *
     * @return endContract - 合同终止日期
     */
    public Date getEndcontract() {
        return endcontract;
    }

    /**
     * 设置合同终止日期
     *
     * @param endcontract 合同终止日期
     */
    public void setEndcontract(Date endcontract) {
        this.endcontract = endcontract;
    }

    /**
     * 获取工龄
     *
     * @return workAge - 工龄
     */
    public Integer getWorkage() {
        return workage;
    }

    /**
     * 设置工龄
     *
     * @param workage 工龄
     */
    public void setWorkage(Integer workage) {
        this.workage = workage;
    }
}