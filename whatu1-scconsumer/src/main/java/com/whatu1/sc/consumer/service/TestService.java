package com.whatu1.sc.consumer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	private RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "hystrixReturn")
	public List<String> getRemoteData(String from) {
		System.out.println("Ribbon客户端Service收到的from值为: " + from);
		// 不能直接用远程服务地址（http://localhost:8762/api/test）
		// 应该用配置的服务名
		Map<String, String> params = new HashMap<>();
		params.put("from", from);
		// 吐槽，restTemplate的GET请求发送参数真是鸡肋，非得用占位符，还不如直接发个GET链接
		return restTemplate.getForObject("http://eurka-producer/api/test?from={from}", List.class, params);
	}

	/**
	 * @Description 自定义熔断方法，参数与返回值要与原函数一致
	 * @param from
	 * @return
	 */
	protected List<String> hystrixReturn(String from) {
		List<String> list = new ArrayList<String>();
		list.add(from + "客户端getRemoteData()方法被熔断了");
		return list;
	}
}