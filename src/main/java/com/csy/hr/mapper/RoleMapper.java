package com.csy.hr.mapper;

import com.csy.hr.domain.Role;
import com.csy.hr.utils.MyMapper;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper extends MyMapper<Role> {
    /**
     *
     * @param hrId
     * @return
     */
    List<Role>selectByHr(@Param("hrId") String hrId);
}