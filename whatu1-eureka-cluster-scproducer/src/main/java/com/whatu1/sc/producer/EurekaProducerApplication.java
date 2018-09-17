package com.whatu1.sc.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 启动服务提供者
 * @author DU
 * @Attention 啓動文件要在Controller的父級
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerApplication.class, args);
	}
}
