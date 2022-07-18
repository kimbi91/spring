package hu.progmatic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    private Festival festival;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return (args) -> {
            festival.play(Genre.CLASSIC, 1750);
            festival.play(Genre.HOUSE, 2005);
            festival.play(Genre.METAL, 2010);
        };
    }
}
