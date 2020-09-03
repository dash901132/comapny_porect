package com.in10se.poc.department;

import com.in10se.poc.department.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import(SwaggerConfig.class)
public class DepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentApplication.class, args);
    }

}
