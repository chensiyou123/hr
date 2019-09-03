package com.csy.hr.service.impl;

import com.csy.hr.domain.Politicsstatus;
import com.csy.hr.mapper.PoliticsstatusMapper;
import com.csy.hr.service.PoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PoliticsstatusServiceImpl implements PoliticsstatusService {

    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    @Override
    public List<Politicsstatus> query(Map map){
        List<Politicsstatus>list = politicsstatusMapper.query(map);
        return list;
    };
}
