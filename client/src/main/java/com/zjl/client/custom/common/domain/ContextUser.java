package com.zjl.client.custom.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContextUser {
    private Integer id;
    private String sqlName;
}
