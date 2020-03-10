package com.bawei.hgshop.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {


    public static void main(String[] args) throws IOException {
    	
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext-kafka-consumer.xml");
        ac.start();
        System.in.read();
    }
}