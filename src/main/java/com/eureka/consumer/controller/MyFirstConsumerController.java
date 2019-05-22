package com.eureka.consumer.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.consumer.MyFirstConsumer;


@RestController
public class MyFirstConsumerController {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private MyFirstConsumer myFirstConsumer;
	
	@GetMapping("/helloWorld")
	public String consumerHelloWorld(@RequestParam("name") String name) {
		return "my name is " +name;
	}
	

	@RequestMapping(value="/consumerHelloWorld",method=RequestMethod.GET)
	public String consumerHelloWorld1(@RequestParam("name") String name) {
		return myFirstConsumer.helloWorld(name) +", Consumer HelloWorld! your port :"+port;
	}
}
