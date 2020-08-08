package services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ESP")
@Service("languageService")
public class ProfileSpanishLanguageService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hola Mundo";
    }
}
