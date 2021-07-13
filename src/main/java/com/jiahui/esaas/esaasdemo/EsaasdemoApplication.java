package com.jiahui.esaas.esaasdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EsaasdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsaasdemoApplication.class, args);
    }

}
