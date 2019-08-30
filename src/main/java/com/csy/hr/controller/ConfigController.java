package com.csy.hr.controller;

import com.csy.hr.domain.Menu;
import com.csy.hr.service.MenuService;
import com.csy.hr.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    MenuService menuService;

    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        Map map = new HashMap();
        map.put("hrId", HrUtils.getCurrentHr().getId());
        return menuService.getMenusByHrId(map);
    }
}
