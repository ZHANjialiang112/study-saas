package com.zjl.hijpa.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wenman
 */
@Component
@Slf4j
@Order(0)
public class HttpLoggingFilter extends CommonsRequestLoggingFilter {

    private static long startTime;

    public HttpLoggingFilter() {
        super.setIncludeQueryString(false);
        super.setIncludePayload(true);
        super.setMaxPayloadLength(10000);
        super.setIncludeHeaders(false);
    }

    @Override
    protected boolean shouldLog(HttpServletRequest request) {
        String method = request.getMethod();
        super.setBeforeMessagePrefix("Before request [" + method );
        super.setAfterMessagePrefix("After request [" + method);
        return true;
    }

    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        startTime = System.currentTimeMillis();
        super.beforeRequest(request, message);
    }


    @Override
    protected void afterRequest(HttpServletRequest request, String message ) {
        String method = request.getMethod();
        String requestURI = request.getRequestURI();
        log.info("request 【{} [{}]】 cost time:{}",method,requestURI,System.currentTimeMillis() - startTime);
    }


}

