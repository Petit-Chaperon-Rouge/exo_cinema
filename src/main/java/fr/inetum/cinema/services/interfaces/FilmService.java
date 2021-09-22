package fr.inetum.cinema.services.interfaces;

import fr.inetum.cinema.models.Film;

import java.util.List;

public interface FilmService {

    List<Film> findAll();
    Film findById(String id);
    Film create(Film film);
    Film put(Film film);
    Film patch(Film film, String id);
    void deleteById(String id);

}
