package fr.inetum.cinema.repositories;

import fr.inetum.cinema.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {}
