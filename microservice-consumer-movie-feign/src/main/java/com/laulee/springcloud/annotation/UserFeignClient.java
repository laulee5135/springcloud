package com.laulee.springcloud.annotation;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laulee.springcloud.entity.User;

@FeignClient("microservice-provider-user")  //要调用的服务的服务名
public interface UserFeignClient {
	
	@RequestMapping(value="/simple/{id}",method=RequestMethod.GET)   //注意：1.不支持GetMapping  2.@PathVariable需要设置value
	public User findById(@PathVariable("id") Long id);
	
	//如果是post请求，并传入的是复杂对象，使用如下:
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public User postUser(@RequestBody User user);
	
	
	//如果是get请求，并传入的是复杂对象，使用如下:
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public User getUser(User user);

}
