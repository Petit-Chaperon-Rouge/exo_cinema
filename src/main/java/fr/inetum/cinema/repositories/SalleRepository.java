package fr.inetum.cinema.repositories;

import fr.inetum.cinema.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository<Salle, String> {}
