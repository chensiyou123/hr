package com.csy.hr.service.impl;

import com.csy.hr.domain.Position;
import com.csy.hr.mapper.PositionMapper;
import com.csy.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> query(Map map) {
        return positionMapper.query(map);
    }
}
