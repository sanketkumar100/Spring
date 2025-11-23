package org.example;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
    public void addStudent() {
        System.out.println("Adding a student...");
    }

    public void deleteStudent() {
        System.out.println("Deleting a student...");
    }
}

