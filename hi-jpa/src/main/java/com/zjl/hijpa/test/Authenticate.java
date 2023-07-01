package com.zjl.hijpa.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authenticate {

   private String username;
   private String password;


    public Boolean canLogin(){
        return true;
    }
}
