package com.zjl.client.custom.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tenant {

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 数据库URL
     */
    private String dbUrl;

    /**
     * 数据库端口
     */
    private String dbPort;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 数据库账号
     */
    private String dbAccount;

    /**
     * 数据库密码
     */
    private String dbPassword;
}
