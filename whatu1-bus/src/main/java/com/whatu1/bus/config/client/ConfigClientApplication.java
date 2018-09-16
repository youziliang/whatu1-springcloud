package com.whatu1.bus.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 启动消息总线配置中心客户端（实现通知微服务架构的配置文件的更改）
 * @author DU
 * @Attention 啓動文件要在Controller的父級
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class ConfigClientApplication {

	/**
     * 发送POST请求 http://localhost:8880/actuator/bus-refresh ，更新配置信息
     * 另外，/actuator/bus-refresh接口可以指定服务，即使用“destination”参数，比如 “/actuator/bus-refresh?destination=config-client:**”：
     * 即刷新服务名为config-client的所有服务
     */
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}