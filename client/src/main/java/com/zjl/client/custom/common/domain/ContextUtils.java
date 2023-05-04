package com.zjl.client.custom.common.domain;

import com.zjl.client.custom.common.domain.ContextUser;

public class ContextUtils {
    public static ContextUser getContextUser() {
        return ContextUser.CONTEXT_USER.get();
    }
}
