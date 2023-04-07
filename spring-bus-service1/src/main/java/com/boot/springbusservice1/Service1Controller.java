package com.boot.springbusservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Service1Controller {

	@Value("${test.name}") private String uri;
	
	@GetMapping("/service1")
	public String service1() {
		return uri;
	}
	
}
