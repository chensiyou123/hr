package com.csy.hr.mapper;

import com.csy.hr.domain.Employee;
import com.csy.hr.domain.Nation;
import com.csy.hr.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Mapper
@Repository
public interface EmployeeMapper extends MyMapper<Employee> {
    List<Employee>query(Map map);
}