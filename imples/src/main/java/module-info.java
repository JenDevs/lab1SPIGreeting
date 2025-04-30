import org.example.greeting.imples.SpanishGreeting;
import org.example.greeting.service.GreetingService;

module module.org.example.greeting.imples {
    requires org.example.greeting.service;
    provides GreetingService with SpanishGreeting;
}