package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context from beans.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the bean from Spring container
        Student st = context.getBean(Student.class);
        System.out.println("Bean Fetched:" +st.getClass().getSimpleName());



    }
}
