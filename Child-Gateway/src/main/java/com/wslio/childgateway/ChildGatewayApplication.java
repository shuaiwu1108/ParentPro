package com.wslio.childgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChildGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildGatewayApplication.class, args);
    }

}
