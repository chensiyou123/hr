package com.csy.hr.mapper;

import com.csy.hr.domain.Politicsstatus;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PoliticsstatusMapper extends MyMapper<Politicsstatus> {
    List<Politicsstatus>query(Map map);
}