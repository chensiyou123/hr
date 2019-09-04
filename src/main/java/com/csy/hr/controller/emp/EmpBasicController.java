package com.csy.hr.controller.emp;

import com.csy.hr.domain.Employee;
import com.csy.hr.mapper.EmployeeMapper;
import com.csy.hr.service.*;
import com.csy.hr.utils.PoiUtils;
import com.csy.hr.utils.RespBean;
import com.csy.hr.utils.page.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/employee/basic")
public class EmpBasicController {
    @Autowired
    EmpService empService;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    PoliticsstatusService politicsstatusService;
    @Autowired
    NationService nationService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    PositionService positionService;
    @Autowired
    JoblevelService joblevelService;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public RespBean getEmployeeByPage(PageQuery pageQuery){
        return empService.query(pageQuery);
    }

    @PostMapping(value = "importEmp")
    public RespBean importEmp(MultipartFile file) {
        Map map = new HashMap();
        List<Employee> emps = PoiUtils.importEmp2List(
                file,
                nationService.query(map),
                politicsstatusService.query(map),
                departmentService.query(map),
                positionService.query(map),
                joblevelService.query(map)
        );
        return null;
    }

    @RequestMapping(value = "/exportEmp", method = RequestMethod.GET)
    public ResponseEntity<byte[]> exportEmp() {
        Map map = new HashMap();
        List<Employee>list = employeeMapper.query(map);
        return PoiUtils.exportEmp2Excel(list);
    }
}
