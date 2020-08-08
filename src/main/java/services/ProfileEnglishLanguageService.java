package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ENG")
@Service("languageService")
public class ProfileEnglishLanguageService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "HELLO ENGLISH";
    }
}
