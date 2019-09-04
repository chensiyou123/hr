package com.csy.hr.service;

import com.csy.hr.utils.RespBean;
import com.csy.hr.utils.page.PageQuery;

public interface EmpService {
    RespBean query(PageQuery pageQuery);
}
