package com.csy.hr.service;

import com.csy.hr.domain.Hr;

import java.util.List;

public interface HrService {
    List<Hr> getAllHrExceptAdmin();
}
