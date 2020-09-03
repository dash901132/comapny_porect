package com.in10se.security;

import com.in10se.security.configuration.SwaggerConfig;
import com.in10se.security.model.Role;
import com.in10se.security.model.User;
import com.in10se.security.service.UserService;
import io.swagger.models.Swagger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class SecurityApplication  {
        public static void main(String[] args) {
            SpringApplication.run(SecurityApplication.class, args);
        }


}
