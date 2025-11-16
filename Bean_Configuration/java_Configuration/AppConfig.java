package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Sanket");
        student.setAge(20);
        return student;
    }

    @Bean
    public School school() {
        School school = new School();
        school.setStudent(student());  // inject student bean
        return school;
    }
}

