package com.capstone.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class AppGatewayConfiguration {
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

		return builder.routes()
				.route(r-> r.path("/api/emi/**").uri("lb://emi-api"))
				.route(r-> r.path("/api/accountinfo/**").uri("lb://accountinfo-api"))
				.route(r-> r.path("/api/loan/**").uri("lb://loan-api"))
				.route(r-> r.path("/api/payment/**").uri("lb://paymentinfo-api"))
				.route(r-> r.path("/api/savingpaymenthistory/**").uri("lb://savingpaymentinfo-api"))
				.route(r-> r.path("/api/users/**").uri("lb://users-api"))
				.route(r-> r.path("/**").uri("lb://authentication-api"))
				.build();
	}
}
