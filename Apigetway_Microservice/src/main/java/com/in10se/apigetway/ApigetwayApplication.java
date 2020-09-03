package com.in10se.apigetway;

import com.in10se.apigetway.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Import(SwaggerConfig.class)
public class ApigetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigetwayApplication.class, args);
    }

}
