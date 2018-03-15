package com.laulee.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.laulee.springcloud.entity.User;

@RestController
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id){
		return this.restTemplate.getForObject("http://microservice-provider-user/simple/"+id, User.class); //路径说明：该路径称为VIP virtual IP
		//此处的microservice-provider-user 是服务提供者的spring.application.name
	}

}
