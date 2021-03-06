package com.iamtek.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-constructor.xml");
        Triangle triangle = (Triangle) context.getBean("triangle1");
        triangle.draw();
        triangle = (Triangle) context.getBean("triangle2");
        triangle.draw();
        triangle = (Triangle) context.getBean("triangle3");
        triangle.draw();
        triangle = (Triangle) context.getBean("triangle4");
        triangle.draw();

    }

}
