package com.csy.hr.controller.emp;

import com.csy.hr.service.EmpService;
import com.csy.hr.utils.RespBean;
import com.csy.hr.utils.page.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee/basic")
public class EmpBasicController {
    @Autowired
    EmpService empService;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public RespBean getEmployeeByPage(PageQuery pageQuery){
        return empService.query(pageQuery);
    }
}
