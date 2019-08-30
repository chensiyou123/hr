package com.csy.hr.mapper;

import com.csy.hr.domain.Menu;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MenuMapper extends MyMapper<Menu> {
    List<Menu>query(Map map);


    List<Menu>getMenusByHrId(Map map);
}