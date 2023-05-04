package com.zjl.client.custom.common.dbutils;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataSourceCustom implements Serializable {
    /**
     * 数据库连接池
     */
    private String poolName;
    /**
     * 数据库连接地址
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 数据库驱动
     */
    private String driverClassName;
    /**
     * 数据源状态： 禁用/启用
     */
    private Integer disableStatus;
}
