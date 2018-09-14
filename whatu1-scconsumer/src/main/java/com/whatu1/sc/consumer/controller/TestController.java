package com.whatu1.sc.consumer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatu1.sc.consumer.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping(value = "/test")
	public List<String> test(HttpServletRequest request, HttpServletResponse response) {
		String from = request.getParameter("from");
		System.out.println("Ribbon客户端Controller收到的from值为: " + from);
		return testService.getRemoteData(from);
	}
}
