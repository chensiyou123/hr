package com.csy.hr.mapper;

import com.csy.hr.domain.Nation;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NationMapper extends MyMapper<Nation> {
    List<Nation>query(Map map);
}