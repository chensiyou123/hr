package com.csy.hr.service.impl;

import com.csy.hr.domain.Nation;
import com.csy.hr.mapper.NationMapper;
import com.csy.hr.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationMapper nationMapper;
    @Override
    public List<Nation> query(Map map) {
        return nationMapper.query(map);
    }
}
