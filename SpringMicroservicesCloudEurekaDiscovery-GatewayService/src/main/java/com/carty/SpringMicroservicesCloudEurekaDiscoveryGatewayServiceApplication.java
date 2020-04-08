package com.carty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
/*
 * Hystrix: If any service is facing an issues and stopped servicing the requests, 
 * it will result in timeout exception and the whole system will fail. It is like a circuit breaker.
 * It aslo monitor the defective module.
 * */
@EnableHystrix
public class SpringMicroservicesCloudEurekaDiscoveryGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesCloudEurekaDiscoveryGatewayServiceApplication.class, args);
	}

}
