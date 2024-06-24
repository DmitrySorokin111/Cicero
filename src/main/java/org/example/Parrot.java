package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;
    private String color;

    public Parrot(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
