package com.example.bean_creation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("studentBean");
        System.out.println(student);
    }
}
