package com.csy.hr.service;

import com.csy.hr.domain.Menu;

import java.util.List;
import java.util.Map;

public interface MenuService {
    List<Menu> getAllMenu(Map map);


    List<Menu> getMenusByHrId(Map map);
}
