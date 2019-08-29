package com.csy.hr.mapper;

import com.csy.hr.domain.Hr;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HrMapper extends MyMapper<Hr> {
    List<Hr> query(Map map);
}