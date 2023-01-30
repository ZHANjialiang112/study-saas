package com.zjl.client.custom.common.servise;

import com.zjl.client.custom.common.domain.ContextUser;
import com.zjl.client.custom.common.domain.ContextUtils;

public class BuildNewUser {

    public static void buildNewUser(){
        ContextUtils.CONTEXT_USER.set(new ContextUser(1,"zjl"));
    }
}
