package com.eureka.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="service-provider", fallback=MyFristConsumerHystrix.class)
public interface MyFirstConsumer {

	@RequestMapping(value="/helloWorld",method=RequestMethod.GET)
	public String helloWorld(@RequestParam("name") String name);
}
