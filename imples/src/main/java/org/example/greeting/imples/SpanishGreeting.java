package org.example.greeting.imples;

import org.example.greeting.service.GreetingLanguage;
import org.example.greeting.service.GreetingService;

@GreetingLanguage("Spanish")
public class SpanishGreeting implements GreetingService {

    @Override
    public String greetingTranslate(String name) {
        return "Hola " + name + "!";
    }

}
