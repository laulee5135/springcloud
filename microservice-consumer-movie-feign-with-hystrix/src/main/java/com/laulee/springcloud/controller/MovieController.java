package com.laulee.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laulee.springcloud.annotation.UserFeignClient;
import com.laulee.springcloud.entity.User;


@RestController
public class MovieController {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	
	@GetMapping("/movie/{id}")	
	public User findById(@PathVariable Long id){
		return userFeignClient.findById(id);
	}
	
}
