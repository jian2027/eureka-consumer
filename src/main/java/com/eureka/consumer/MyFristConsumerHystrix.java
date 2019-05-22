package com.eureka.consumer;

import org.springframework.stereotype.Component;

@Component
public class MyFristConsumerHystrix implements MyFirstConsumer{
    @Override
    public String helloWorld(String name) {
        return "server is closed , your send failed";
    }
}