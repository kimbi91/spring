package hu.progmatic.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mozart implements Musician{

    @Override
    public int play(Genre genre, int year) {
        if (year < 1900) {
            return 100;
        } else if (year < 1950) {
            return 50;
        }
        return 25;
    }
}
