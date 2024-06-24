package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
