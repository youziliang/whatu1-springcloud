package com.whatu1.zipkin.passive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 启动服务链路追踪被调用方
 * @author DU
 * @Attention 啓動文件要在Controller的父級
 */
@SpringBootApplication
public class ZipkinPassiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinPassiveApplication.class, args);
	}

}
