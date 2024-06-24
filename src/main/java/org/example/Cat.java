package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
