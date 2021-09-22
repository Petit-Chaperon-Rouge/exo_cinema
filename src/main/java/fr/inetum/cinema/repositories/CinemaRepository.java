package fr.inetum.cinema.repositories;

import fr.inetum.cinema.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CinemaRepository extends MongoRepository<Cinema, String> {}
