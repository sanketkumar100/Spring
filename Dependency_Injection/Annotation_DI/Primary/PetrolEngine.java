package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // This will be injected by default
public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started...");
    }
}

