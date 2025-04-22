package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.capstone.filter.UsersApiFilter;

@EnableEurekaClient
@SpringBootApplication
public class UsersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean jwtFilter() {
	    final FilterRegistrationBean regBean=new FilterRegistrationBean();
	    regBean.setFilter(new UsersApiFilter());
	    regBean.addUrlPatterns("/api/*");
	    return regBean;
	}
}
