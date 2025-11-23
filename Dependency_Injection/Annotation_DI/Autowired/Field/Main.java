package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Create Spring container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Car bean
        Car car = context.getBean(Car.class);

        // Use it
        car.drive();
    }
}


