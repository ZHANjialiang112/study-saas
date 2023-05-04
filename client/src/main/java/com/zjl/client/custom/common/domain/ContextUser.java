package com.zjl.client.custom.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContextUser {
    public static final ThreadLocal<ContextUser> CONTEXT_USER = new ThreadLocal<>();
    private Integer id;
    private String sqlName;
}
