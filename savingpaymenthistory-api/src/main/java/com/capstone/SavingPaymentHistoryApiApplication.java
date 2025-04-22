package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.capstone.filter.SavingPaymentHistoryFilter;

@EnableEurekaClient
@SpringBootApplication
public class SavingPaymentHistoryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavingPaymentHistoryApiApplication.class, args);
	}

	@Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean regBean=new FilterRegistrationBean();
        regBean.setFilter(new SavingPaymentHistoryFilter());
        regBean.addUrlPatterns("/api/*");
        return regBean;
	}
}
