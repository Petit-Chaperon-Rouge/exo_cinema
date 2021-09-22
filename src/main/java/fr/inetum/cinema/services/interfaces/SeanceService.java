package fr.inetum.cinema.services.interfaces;

import fr.inetum.cinema.models.Seance;

import java.util.List;

public interface SeanceService {

    List<Seance> findAll();
    Seance findById(String id);
    Seance create(Seance seance);
    Seance put(Seance seance);
    Seance patch(Seance seance, String id);
    void deleteById(String id);

}
