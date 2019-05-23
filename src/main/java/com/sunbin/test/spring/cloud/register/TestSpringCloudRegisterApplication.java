package com.sunbin.test.spring.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestSpringCloudRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudRegisterApplication.class, args);
	}

}
