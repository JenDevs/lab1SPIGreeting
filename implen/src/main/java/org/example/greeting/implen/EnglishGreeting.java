package org.example.greeting.implen;

import org.example.greeting.service.GreetingService;

public class EnglishGreeting implements GreetingService {

    @Override
    public String greetingTranslate(String name) {
        return "Hello " + name + "!";
    }

}
