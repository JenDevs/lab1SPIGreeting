import org.example.greeting.implsv.SwedishGreeting;
import org.example.greeting.service.GreetingService;

module org.example.greeting.implsv {
    requires org.example.greeting.service;
    provides GreetingService with SwedishGreeting;
}
