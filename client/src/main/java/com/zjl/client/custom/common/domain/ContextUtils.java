package com.zjl.client.custom.common.domain;

import com.zjl.client.custom.common.domain.ContextUser;

public class ContextUtils {

    public static final ThreadLocal<ContextUser> CONTEXT_USER = new ThreadLocal<>();
}
