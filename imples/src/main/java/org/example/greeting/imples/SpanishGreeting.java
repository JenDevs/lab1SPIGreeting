package org.example.greeting.imples;

import org.example.greeting.service.GreetingService;

public class SpanishGreeting implements GreetingService {

    @Override
    public String greetingTranslate(String name) {
        return "Hola " + name + "!";
    }
}
