package fr.inetum.cinema;

import fr.inetum.cinema.repositories.FilmRepository;
import fr.inetum.cinema.services.FilmServiceImpl;
import fr.inetum.cinema.services.interfaces.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService(FilmRepository filmRepository) {
        return new FilmServiceImpl(filmRepository);
    }

}
