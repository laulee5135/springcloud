package com.laulee.springcloud.annotation;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.laulee.config.FeignConfiguration;
import com.laulee.springcloud.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="microservice-provider-user",configuration=FeignConfiguration.class)
public interface UserFeignClient {
	
	//@RequestMapping(value="/simple/{id}",method=RequestMethod.GET)   //注意：1.不支持GetMapping  2.@PathVariable需要设置value
	@RequestLine("GET /simple/{id}")
	public User findById(@Param("id") Long id);
	
}
