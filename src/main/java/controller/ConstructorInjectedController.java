package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import services.GreetingService;

/*
    spring managed component which is brought into the spring context
 */
@Component
public class ConstructorInjectedController {

    /* tells spring we want greetingService injected in this bean
        option to add to constcutor based injection
    */

    private final GreetingService greetingService;

    /*
        Using qualifier tells spring which bean to inject since
        we have multiple components that qualify for injection
     */
    public ConstructorInjectedController(@Qualifier("anotherGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreetings();
    }
}
