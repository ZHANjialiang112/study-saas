package com.zjl.hijpa.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class TestLogin {

    private Authenticate authenticate = Mockito.mock(Authenticate.class);
    private LoginService loginService = Mockito.spy(new LoginService(authenticate));


    @Test
    public void test1(){
        Mockito.when(authenticate.canLogin()).thenReturn(true);
//        Mockito.when(loginService.login()).thenReturn(true);
        System.out.println(loginService.login());
        Mockito.verify(authenticate,Mockito.times(2)).canLogin();
    }
}
