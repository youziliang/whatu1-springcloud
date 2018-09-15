package com.whatu1.sc.producer.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestApi {

	@GetMapping("test")
	public List<String> test(HttpServletRequest request, HttpServletResponse response) {
		String from = request.getParameter("from");
		List<String> list = new ArrayList<>();
		list.add("This is a test message from 8763 port! origin is: " + from);
		return list;
	}
	
	@GetMapping("test-1")
	public List<String> test_1(HttpServletRequest request, HttpServletResponse response) {
		String from = request.getParameter("from");
		List<String> list = new ArrayList<>();
		list.add("This is a test_1 message from 8763 port! origin is: " + from);
		return list;
	}
}
