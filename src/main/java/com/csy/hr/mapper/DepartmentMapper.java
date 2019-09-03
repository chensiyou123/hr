package com.csy.hr.mapper;

import com.csy.hr.domain.Department;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DepartmentMapper extends MyMapper<Department> {
    List<Department>query(Map map);
}