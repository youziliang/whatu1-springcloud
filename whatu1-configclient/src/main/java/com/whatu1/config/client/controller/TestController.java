package com.whatu1.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${version}")
	private String version;

	@GetMapping(value = "getVersion")
	public String getVersion() {
		return version;
	}
}
