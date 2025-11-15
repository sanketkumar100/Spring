package org.example;

public class Student
{
    public Student()
    {
        System.out.println("Constructor called using xml initialization(init-method)");
    }

    public void init()
    {
        System.out.println("Bean initialization logic in init() method.");
    }
}
