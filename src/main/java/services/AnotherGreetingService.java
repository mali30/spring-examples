package services;

import org.springframework.stereotype.Component;

@Component
public class AnotherGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Another Greeting";
    }
}
