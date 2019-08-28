package com.csy.hr.service.impl;

import com.csy.hr.domain.Menu;
import com.csy.hr.mapper.MenuMapper;
import com.csy.hr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    public List<Menu> getAllMenu(Map map){
        return menuMapper.query(map);
    }
}
