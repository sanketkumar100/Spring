package org.example;

public class MyService {

    private String message;

    public MyService() {
        this.message = "Hello from Spring Bean!";
    }

    public void sayHello() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
