package com.wslio.childprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChildProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildProviderApplication.class, args);
    }

}
