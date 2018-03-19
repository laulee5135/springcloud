package com.laulee.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.laulee.springcloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	@HystrixCommand(fallbackMethod = "defaultStores")
	public User findById(@PathVariable Long id){
		return this.restTemplate.getForObject("http://localhost:7900/simple/"+id, User.class);
	}
	
	public User defaultStores(Long id) {
		User user = new User();
		user.setAge(99);
        return user;
    }

}
