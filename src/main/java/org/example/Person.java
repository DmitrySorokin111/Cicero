package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    private String name;
    private Cat cat;
    private Dog dog;
    private List<Parrot> parrots;

    public Person(String name, int age, Cat cat, Dog dog, List<Parrot> parrots) {
        this.name = name;
        this.cat = cat;
        this.dog = dog;
        this.parrots = parrots;
    }
}
