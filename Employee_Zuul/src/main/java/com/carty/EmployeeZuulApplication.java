package com.carty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EmployeeZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeZuulApplication.class, args);
	}

			@Bean
			public PostFilter postFilter() {
				return new PostFilter();
			}
			
			@Bean
			public PreFilter preFilter() {
				return new PreFilter();
			}
			
			@Bean
			public ErrorFilter errorFilter() {
				return new ErrorFilter();
			}
			
			@Bean
			public RouteFilter routeFilter() {
				return new RouteFilter();
			}
	}
