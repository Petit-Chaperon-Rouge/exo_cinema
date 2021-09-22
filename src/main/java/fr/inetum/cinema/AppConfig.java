package fr.inetum.cinema;

import fr.inetum.cinema.repositories.CinemaRepository;
import fr.inetum.cinema.repositories.FilmRepository;
import fr.inetum.cinema.repositories.SalleRepository;
import fr.inetum.cinema.repositories.SeanceRepository;
import fr.inetum.cinema.services.CinemaServiceImpl;
import fr.inetum.cinema.services.FilmServiceImpl;
import fr.inetum.cinema.services.SalleServiceImpl;
import fr.inetum.cinema.services.SeanceServiceImpl;
import fr.inetum.cinema.services.interfaces.CinemaService;
import fr.inetum.cinema.services.interfaces.FilmService;
import fr.inetum.cinema.services.interfaces.SalleService;
import fr.inetum.cinema.services.interfaces.SeanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService(FilmRepository filmRepository) {
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository) {
        return new SeanceServiceImpl(seanceRepository);
    }

    @Bean
    public SalleService salleService(SalleRepository salleRepository) {
        return new SalleServiceImpl(salleRepository);
    }

    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository) {
        return new CinemaServiceImpl(cinemaRepository);
    }
}
