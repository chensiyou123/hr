package com.csy.hr.service.impl;

import com.csy.hr.domain.Employee;
import com.csy.hr.domain.Nation;
import com.csy.hr.mapper.EmployeeMapper;
import com.csy.hr.service.EmpService;
import com.csy.hr.utils.RespBean;
import com.csy.hr.utils.page.PageQuery;
import com.csy.hr.utils.result.SimplePage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public RespBean query(PageQuery pageQuery) {
        Map map = pageQuery.convertFilterToMap();
        PageHelper.startPage(pageQuery.getPage(), pageQuery.getSize());
        List<Employee> list = employeeMapper.query(map);
        PageInfo pageInfo = new PageInfo(list);
        return RespBean.ok("查询成功", new SimplePage<Employee>().convert(pageInfo));
    }

}
