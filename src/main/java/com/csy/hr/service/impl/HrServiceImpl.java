package com.csy.hr.service.impl;

import com.csy.hr.domain.Hr;
import com.csy.hr.mapper.HrMapper;
import com.csy.hr.service.HrService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class HrServiceImpl implements HrService {


    @Autowired
    private HrMapper hrMapper;

    @Override
    public List<Hr> getAllHrExceptAdmin() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Map map = new HashMap();
        map.put("username",name);
        List<Hr> hrs=hrMapper.query(map);
        if(CollectionUtils.isEmpty(hrs)){
            return (UserDetails) new UsernameNotFoundException("用户名不存在");
        }
        return (UserDetails) hrs.get(0);
    }
}
