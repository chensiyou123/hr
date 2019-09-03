package com.csy.hr.service;

import com.csy.hr.domain.Nation;
import com.csy.hr.utils.RespBean;
import com.csy.hr.utils.page.PageQuery;

import java.util.List;

public interface EmpService {
    RespBean query(PageQuery pageQuery);
}
