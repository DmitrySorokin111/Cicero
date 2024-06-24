package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Cat cat() {
        return new Cat("Whiskers", "Siamese");
    }

    @Bean
    public Dog dog() {
        return new Dog("Buddy", "Golden Retriever");
    }

    @Bean
    public Parrot parrot1() {
        return new Parrot("Polly", "Green");
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot("Kiki", "Yellow");
    }

    @Bean
    public List<Parrot> parrots() {
        return Arrays.asList(parrot1(), parrot2());
    }

    @Bean
    public Person person() {
        return new Person("John Doe", 30, cat(), dog(), parrots());
    }
}
