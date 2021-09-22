package fr.inetum.cinema.services.interfaces;

import fr.inetum.cinema.models.Salle;

import java.util.List;

public interface SalleService {

    List<Salle> findAll();
    Salle findById(String id);
    Salle create(Salle salle);
    Salle put(Salle salle);
    Salle patch(Salle salle, String id);
    void deleteById(String id);

}
