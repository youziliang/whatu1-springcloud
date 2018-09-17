package com.whatu1.zipkin.positive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 启动服务链路追踪调用方
 * @author DU
 * @Attention 啓動文件要在Controller的父級
 */
@SpringBootApplication
public class ZipkinPositiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinPositiveApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
