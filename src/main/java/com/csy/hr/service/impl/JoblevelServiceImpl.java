package com.csy.hr.service.impl;

import com.csy.hr.domain.Joblevel;
import com.csy.hr.mapper.JoblevelMapper;
import com.csy.hr.service.JoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JoblevelServiceImpl implements JoblevelService {
    @Autowired
    private JoblevelMapper joblevelMapper;

    @Override
    public List<Joblevel> query(Map map) {
        return joblevelMapper.query(map);
    }
}
