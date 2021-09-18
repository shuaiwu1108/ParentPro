package com.wslio.childcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChildCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildCommonApplication.class, args);
    }
}
