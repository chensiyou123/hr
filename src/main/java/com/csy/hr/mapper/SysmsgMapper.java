package com.csy.hr.mapper;

import com.csy.hr.domain.Sysmsg;
import com.csy.hr.utils.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysmsgMapper extends MyMapper<Sysmsg> {
    List<Sysmsg>getSysMsg(@Param("start") int start, @Param("size") Integer size, @Param("hrid") Integer hrid);
}