package com.csy.hr.service;

import com.csy.hr.domain.Sysmsg;

import java.util.List;

public interface SysMsgService {
    List<Sysmsg> getSysMsgByPage(Integer page, Integer size);
}
