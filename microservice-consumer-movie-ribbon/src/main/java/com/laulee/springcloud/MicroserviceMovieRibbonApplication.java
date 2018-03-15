package com.laulee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.laulee.config.TestConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="microservice-provider-user",configuration=TestConfiguration.class)
public class MicroserviceMovieRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMovieRibbonApplication.class, args);
	}
	
	@Bean
	@LoadBalanced  //加入此注解说明已整合Ribbon了
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
