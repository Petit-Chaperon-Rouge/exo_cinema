package fr.inetum.cinema.services.interfaces;

import fr.inetum.cinema.models.Cinema;

import java.util.List;

public interface CinemaService {

    List<Cinema> findAll();
    Cinema findById(String id);
    Cinema create(Cinema cinema);
    Cinema put(Cinema cinema);
    Cinema patch(Cinema cinema, String id);
    void deleteById(String id);

}
