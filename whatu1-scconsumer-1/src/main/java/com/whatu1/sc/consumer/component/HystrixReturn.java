package com.whatu1.sc.consumer.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.whatu1.sc.consumer.service.TestService;

@Component
public class HystrixReturn implements TestService {

	@Override
	public List<String> getRemoteData(String from) {
		List<String> list = new ArrayList<String>();
		list.add(from + "客户端getRemoteData()方法被熔断了");
		return list;
	}

}
