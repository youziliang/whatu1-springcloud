package com.whatu1.sc.producer.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("api")
public class TestApi {

	@GetMapping("test")
	@HystrixCommand(fallbackMethod = "ifError")
	public List<String> test(String from) {
		List<String> list = new ArrayList<>();
		list.add("This is a test message from 8777 port! origin is: " + from);
		return list;
	}

	public List<String> ifError(String from) {
		List<String> list = new ArrayList<>();
		list.add("The test message from 8777 port HYSTIX");
		return list;
	}

	@GetMapping("test-1")
	public List<String> test_1(HttpServletRequest request, HttpServletResponse response) {
		String from = request.getParameter("from");
		List<String> list = new ArrayList<>();
		list.add("This is a test_1 message from 8777 port! origin is: " + from);
		return list;
	}
}
