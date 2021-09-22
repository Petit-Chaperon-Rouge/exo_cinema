package fr.inetum.cinema.repositories;

import fr.inetum.cinema.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, String> {}
