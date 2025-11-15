package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    public Student()
    {
        System.out.println("Constructor called using @PostConstruct");
    }
@PostConstruct
    public void init()
    {
        System.out.println("@PostConstruct init() method called after dependency Injection");
    }
}
