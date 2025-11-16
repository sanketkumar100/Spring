package org.example;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    private String name = "Sanket";
    private int age = 20;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}


