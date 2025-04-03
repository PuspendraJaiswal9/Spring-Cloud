package com.example.bean_creation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student std=(Student) context.getBean("student");
        System.out.println(std);
        context.registerShutdownHook();
    }
}
