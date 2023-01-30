package com.zjl.client.custom;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Valid
public class UserDto {
    @NotBlank(message = "用户名不能为空")
    private String name;
    private String sqlName;
}
