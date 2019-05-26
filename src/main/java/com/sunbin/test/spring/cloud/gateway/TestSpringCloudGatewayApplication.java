package com.sunbin.test.spring.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient // 开启发现服务功能
@EnableZuulProxy
@SpringBootApplication
public class TestSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudGatewayApplication.class, args);
	}

}
