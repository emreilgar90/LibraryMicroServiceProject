package com.emre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient //*03. 18:00
@EnableEurekaClient
public class LibraryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryServiceApplication.class,args);
    }
}