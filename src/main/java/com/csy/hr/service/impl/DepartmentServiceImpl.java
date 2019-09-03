package com.csy.hr.service.impl;

import com.csy.hr.domain.Department;
import com.csy.hr.mapper.DepartmentMapper;
import com.csy.hr.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> query(Map map) {
        return departmentMapper.query(map);
    }
}
