package com.csy.hr.service.impl;

import com.csy.hr.domain.Sysmsg;
import com.csy.hr.mapper.SysmsgMapper;
import com.csy.hr.service.SysMsgService;
import com.csy.hr.utils.HrUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysMsgServiceImpl implements SysMsgService {

    @Autowired
    private SysmsgMapper sysMsgMapper;
    @Override
    public List<Sysmsg> getSysMsgByPage(Integer page, Integer size) {
        PageHelper pageHelper = new PageHelper();
        int start = (page - 1) * size;
        return sysMsgMapper.getSysMsg(start,size, HrUtils.getCurrentHr().getId());
    }
}
