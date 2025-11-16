package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        School school = context.getBean("school", School.class);

        System.out.println("Student Name: " + school.getStudent().getName());
        System.out.println("Student Age: " + school.getStudent().getAge());
    }
}

