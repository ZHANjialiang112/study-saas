package com.zjl.hijpa.config.jpa;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
//        可以从上下文中获取当前用户信息
        return Optional.ofNullable("zjl");
    }
}

