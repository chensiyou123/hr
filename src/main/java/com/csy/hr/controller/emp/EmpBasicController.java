package com.csy.hr.controller.emp;

import com.csy.hr.utils.result.SimpleMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee/basic")
public class EmpBasicController {
    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public SimpleMessage getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page,
                                           @RequestParam(defaultValue = "10") Integer size,
                                           @RequestParam(defaultValue = "") String keywords,
                                           Long politicId, Long nationId, Long posId,
                                           Long jobLevelId, String engageForm,
                                           Long departmentId, String beginDateScope ){
        Map<String, Object> map = new HashMap<>();

        return null;
    }
}
