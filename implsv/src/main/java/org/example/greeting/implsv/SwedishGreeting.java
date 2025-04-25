package org.example.greeting.implsv;

import org.example.greeting.service.GreetingService;

public class SwedishGreeting implements GreetingService {


    @Override
    public String greetingTranslate(String name) {
        return "Hej " + name + "!";
    }
}
