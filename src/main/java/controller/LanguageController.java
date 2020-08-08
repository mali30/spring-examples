package controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class LanguageController {

    private final GreetingService greetingService;

    public LanguageController(@Qualifier("languageService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreetings();
    }
}
