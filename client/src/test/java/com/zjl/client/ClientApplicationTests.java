package com.zjl.client;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientApplicationTests {

    public String url = "jdbc:mysql://127.0.0.1:3306/saas?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8&useSSL=false&allowPublicKeyRetrieval=true";

    public String username = "root";

    public String password = "123456";

    @Test
    void contextLoads() {
        Flyway.configure().baselineOnMigrate(true)
                .cleanDisabled(true)
                .validateOnMigrate(false)
                .locations("db/migrate")
                .encoding("UTF-8").table("schema_version")
                .dataSource(url,username,password).load().migrate();
    }
}
