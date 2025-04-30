package org.example.greeting.implsv;

import org.example.greeting.service.GreetingLanguage;
import org.example.greeting.service.GreetingService;

@GreetingLanguage("Swedish")
public class SwedishGreeting implements GreetingService {

    @Override
    public String greetingTranslate(String name) {
        return "Hej " + name + "!";
    }

}
