package com.csy.hr.service;

import com.csy.hr.domain.Hr;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface HrService extends UserDetailsService {
    List<Hr> getAllHrExceptAdmin();
}
