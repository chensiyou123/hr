package com.csy.hr.service.impl;

import com.csy.hr.domain.Hr;
import com.csy.hr.service.HrService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrServiceImpl implements HrService {



    @Override
    public List<Hr> getAllHrExceptAdmin() {
        return null;
    }
}
