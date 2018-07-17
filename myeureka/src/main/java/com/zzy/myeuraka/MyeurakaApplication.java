package com.zzy.myeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyeurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeurakaApplication.class, args);
	}
}
