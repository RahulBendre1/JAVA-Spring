package com.iamtek.joinpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-joinpoint.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        System.out.println("Main: " + shapeService.getTriangle().getName());
        shapeService.getTriangle().setName("New Triangle");
        System.out.println("Main: " + shapeService.getTriangle().getName());


    }

}
