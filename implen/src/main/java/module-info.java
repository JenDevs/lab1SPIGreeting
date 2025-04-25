import org.example.greeting.implen.EnglishGreeting;
import org.example.greeting.service.GreetingService;

module org.example.greeting.implen {
    requires org.example.greeting.service;
    provides GreetingService with EnglishGreeting;
}