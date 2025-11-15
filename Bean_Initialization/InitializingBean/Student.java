package org.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Student implements InitializingBean
{
    public Student()
    {
        System.out.println("Constructor called using @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Student afterPropertiesSet() method called after Dependency injection");
    }
}
