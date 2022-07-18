package hu.progmatic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Festival {
    @Autowired
    private Musician musician;

    public void play(Genre genre, int year) {
        int succes = musician.play(genre, year);

        System.out.println("A " + genre + " műfajú "
                + year + " -ban / -ben megjelent szám "
                + succes + "% sikert aratott.");
    }
}
