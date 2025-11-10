package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean from Spring container
        Student st = context.getBean("student", Student.class);


    }
}
