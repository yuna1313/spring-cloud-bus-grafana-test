package com.grafana.grafanatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GrafanaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrafanaTestApplication.class, args);
	}

}
