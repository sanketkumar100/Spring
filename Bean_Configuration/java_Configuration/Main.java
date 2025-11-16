package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        School school = context.getBean(School.class);

        System.out.println("Student Name: " + school.getStudent().getName());
        System.out.println("Student Age: " + school.getStudent().getAge());
    }
}

