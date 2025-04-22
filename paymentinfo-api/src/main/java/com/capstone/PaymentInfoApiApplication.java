package com.capstone;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.capstone.filter.PaymentApiFilter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class PaymentInfoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentInfoApiApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean jwtFilter() {
	    final FilterRegistrationBean regBean=new FilterRegistrationBean();
	    regBean.setFilter(new PaymentApiFilter());
	    regBean.addUrlPatterns("/api/*");
	    return regBean;
	}
	
}
