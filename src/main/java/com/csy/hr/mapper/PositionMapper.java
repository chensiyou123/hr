package com.csy.hr.mapper;

import com.csy.hr.domain.Position;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PositionMapper extends MyMapper<Position> {
    List<Position>query(Map map);
}