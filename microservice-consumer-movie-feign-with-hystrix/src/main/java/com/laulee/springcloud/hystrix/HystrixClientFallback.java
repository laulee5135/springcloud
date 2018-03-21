package com.laulee.springcloud.hystrix;

import org.springframework.stereotype.Component;

import com.laulee.springcloud.annotation.UserFeignClient;
import com.laulee.springcloud.entity.User;

@Component
public class HystrixClientFallback implements UserFeignClient{

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(0L);
		return user;
	}

}
