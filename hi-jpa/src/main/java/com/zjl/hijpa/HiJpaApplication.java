package com.zjl.hijpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.zjl.hijpa.repository")
@EntityScan("com.zjl.hijpa.domain.entity")
public class HiJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiJpaApplication.class, args);
    }

}
