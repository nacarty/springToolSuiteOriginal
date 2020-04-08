package com.carty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class SpringCloudConfig {

		@Bean
		public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
			return builder.routes()
					.route(r->r.path("/firstservice/message")
					.filters(f->f.hystrix(h->h.setName("Hystrix").setFallbackUri("forward:/fallback/message")))
					 .uri("lb://FIRSTSERVICE")
					 .id("firstModule"))
					 
			
			         .route(r->r.path("/secondservice/message")
			         .filters(f->f.hystrix(h->h.setName("Hystrix").setFallbackUri("forward:/fallback/message")))
					 .uri("lb://SECONDSERVICE")
					 .id("secondModule"))
					 .build();
			
			
			
		}
	}


