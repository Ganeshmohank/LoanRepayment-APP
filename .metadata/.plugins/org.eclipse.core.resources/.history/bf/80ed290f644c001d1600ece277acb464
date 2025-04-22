package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.capstone.filter.EmiFilter;

@EnableEurekaClient
@SpringBootApplication
public class EmiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmiApiApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean jwtFilter() {
	    final FilterRegistrationBean regBean=new FilterRegistrationBean();
	    regBean.setFilter(new EmiFilter());
	    regBean.addUrlPatterns("/api/*");
	    return regBean;
	}

}
