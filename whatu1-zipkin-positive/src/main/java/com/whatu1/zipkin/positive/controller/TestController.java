package com.whatu1.zipkin.positive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("callMiya")
	public String callMiya() {
		return restTemplate.getForObject("http://localhost:8989/miya", String.class);
	}
}
