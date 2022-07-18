package hu.progmatic.spring;

import org.springframework.stereotype.Component;

@Component
public class PumpedGabo implements Musician{
    @Override
    public int play(Genre genre, int year) {
        if (genre == Genre.HOUSE) {
            return 100;
        }

        return 15;
    }
}
