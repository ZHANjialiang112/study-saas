package com.zjl.client.custom.interceptor;

import com.zjl.client.custom.common.domain.ContextUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Optional;

@Slf4j
public class DynamicDataSourceInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}

