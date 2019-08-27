package com.csy.hr.service.impl;

import com.csy.hr.domain.Hr;
import com.csy.hr.service.HrService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HrServiceImpl implements HrService {



    @Override
    public List<Hr> getAllHrExceptAdmin() {
        return null;
    }
}
