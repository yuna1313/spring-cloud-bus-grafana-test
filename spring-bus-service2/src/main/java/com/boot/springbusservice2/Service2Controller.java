package com.boot.springbusservice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Service2Controller {

	@Value("${test.name}") private String uri;
	
	@GetMapping("/service2")
	public String service2() {
		return uri;
	}
	
}
