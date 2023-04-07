package com.grafana.grafanatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/test")
	public String endPoint1() {
		return "work";
	}

}
