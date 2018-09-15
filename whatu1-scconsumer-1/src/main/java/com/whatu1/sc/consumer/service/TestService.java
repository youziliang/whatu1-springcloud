package com.whatu1.sc.consumer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.whatu1.sc.consumer.component.HystrixReturn;

//自带熔断，需要application.yml中配置；熔断方法需要实现本接口
@FeignClient(value = "zuul-server", fallback = HystrixReturn.class)
public interface TestService {

	@GetMapping("api/test-1")
	public List<String> getRemoteData(@RequestParam("from") String from);
}
