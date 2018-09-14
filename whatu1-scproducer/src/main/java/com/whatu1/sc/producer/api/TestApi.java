package com.whatu1.sc.producer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestApi {

	@GetMapping("test")
	public List<String> test(String from) {
		List<String> list = new ArrayList<>();
		list.add("This is a test message from 8762 port! origin is: " + from);
		return list;
	}
}
