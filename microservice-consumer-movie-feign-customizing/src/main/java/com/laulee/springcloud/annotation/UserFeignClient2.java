package com.laulee.springcloud.annotation;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laulee.config.FeignConfiguration2;

@FeignClient(name="xxx",url="http://localhost:8761/",configuration=FeignConfiguration2.class)  //如果Feign和Eureka连用，name和url属性同时使用，这里的name只是一个名称而已，如果name和其它的属性同时出现，那么name指的就是被消费的服务的serviceid
public interface UserFeignClient2 {
	
	@RequestMapping(value="/eureka/apps/{servicename}")
	public String findServiceNameFromEurekaByServiceName(@PathVariable("servicename") String servicename);

}
