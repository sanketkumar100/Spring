package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car
{

    private final Engine engine;

    @Autowired
    public Car(@Qualifier("dieselEngine") Engine engine) {  // Explicitly inject DieselEngine
        this.engine = engine;
    }

    public void drive()
    {
        engine.start();
        System.out.println("Car is driving...");
    }
}




