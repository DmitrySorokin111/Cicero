package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/person")
    public Person getPerson() {
        return (Person) context.getBean("person");
    }
}
