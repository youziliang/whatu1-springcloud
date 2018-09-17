package com.whatu1.zipkin.passive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("miya")
	public String miya() {
		 return "Miya is called";
	}

}
