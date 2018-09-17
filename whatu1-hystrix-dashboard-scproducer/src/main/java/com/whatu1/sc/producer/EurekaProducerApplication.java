package com.whatu1.sc.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description 启动服务提供者（断路器监控）
 * @author DU
 * @Attention 啓動文件要在Controller的父級
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
@EnableHystrixDashboard // 启动hystrix监控面板
public class EurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerApplication.class, args);
	}
}
