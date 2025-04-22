package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.capstone.filter.AccountInfoFilter;

@EnableEurekaClient
@SpringBootApplication
public class AccountInfoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountInfoApiApplication.class, args);
	}
	@Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean regBean=new FilterRegistrationBean();
        regBean.setFilter(new AccountInfoFilter());
        regBean.addUrlPatterns("/api/*");
        return regBean;
    }
}
