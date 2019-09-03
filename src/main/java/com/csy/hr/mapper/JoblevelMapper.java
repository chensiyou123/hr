package com.csy.hr.mapper;

import com.csy.hr.domain.Joblevel;
import com.csy.hr.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface JoblevelMapper extends MyMapper<Joblevel> {
    List<Joblevel>query(Map map);
}