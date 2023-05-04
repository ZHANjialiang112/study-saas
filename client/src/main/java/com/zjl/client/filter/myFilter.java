package com.zjl.client.filter;

import com.zjl.client.custom.common.domain.ContextUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Configuration
@Slf4j
public class myFilter implements Filter {

    public static List<String> list = new ArrayList<>();

     static {
         list.add("/register");
     }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        log.info("requestURI:{}",requestURI);
        if (list.contains(requestURI)){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        int status = response.getStatus();
        System.out.println(status);
    }

    @Override
    public void destroy() {
        ContextUser.CONTEXT_USER.remove();
        Filter.super.destroy();
    }
}
