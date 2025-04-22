package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.capstone.filter.LoanApiFilter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class LoanApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApiApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean jwtFilter() {
	    final FilterRegistrationBean regBean=new FilterRegistrationBean();
	    regBean.setFilter(new LoanApiFilter());
	    regBean.addUrlPatterns("/api/*");
	    return regBean;
	}

}
