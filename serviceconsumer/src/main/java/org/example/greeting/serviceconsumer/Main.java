package org.example.greeting.serviceconsumer;

import org.example.greeting.service.GreetingLanguage;
import org.example.greeting.service.GreetingService;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceLoader<GreetingService> greetings = ServiceLoader.load(GreetingService.class);
        Map<Integer, GreetingService> choice = new HashMap<>();

        System.out.println("Choice your language: ");
        System.out.println(" ");

        int i = 1;
        for (GreetingService service : greetings) {
            GreetingLanguage language = service.getClass().getAnnotation(GreetingLanguage.class);
            if (language != null) {
                System.out.println(i + ": "  + language.value());
                choice.put(i, service);
                i++;
            } else {
                System.out.println("ERROR: No GreetingLanguage annotation found" + service.getClass().getName());
            }
        }
        System.out.println(" ");
        int languageChoice = Integer.parseInt(sc.nextLine());

        GreetingService select = choice.get(languageChoice);
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println(select.greetingTranslate(name));
    }
}
