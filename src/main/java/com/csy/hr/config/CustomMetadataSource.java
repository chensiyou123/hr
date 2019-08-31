package com.csy.hr.config;

import com.csy.hr.domain.Menu;
import com.csy.hr.domain.Role;
import com.csy.hr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    /**
     * 访问路径匹配到的橘色
     * @param o 访问路径
     * @return
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<Menu> allMenu = menuService.getAllMenu(null);
        for (Menu menu : allMenu) {
            if (!Objects.isNull(menu) && antPathMatcher.match(menu.getUrl(), requestUrl) && !CollectionUtils.isEmpty(menu.getRoles())){
                List<Role> roles = menu.getRoles();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(values);
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
