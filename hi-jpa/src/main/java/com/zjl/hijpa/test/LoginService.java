package com.zjl.hijpa.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final Authenticate authenticate;


    public Boolean login() {
        return authenticate.canLogin();
    }
}
