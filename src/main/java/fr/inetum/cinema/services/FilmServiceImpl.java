package fr.inetum.cinema.services;

import fr.inetum.cinema.models.Film;
import fr.inetum.cinema.repositories.FilmRepository;
import fr.inetum.cinema.services.interfaces.FilmService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film findById(String id) {
        return this.filmRepository.findById(id).orElse(null);
    }

    @Override
    public Film create(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film put(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film patch(Film film, String id) {
        Film savedFilm = this.filmRepository.findById(id).orElse(null);

        map(film, savedFilm);

        assert savedFilm != null;
        return this.filmRepository.save(savedFilm);
    }

    @Override
    public void deleteById(String id) {
        this.filmRepository.deleteById(id);
    }


    private static void map(Film from, Film to) {
        if (!from.getNom().isBlank() && !from.getNom().isBlank()) {
            to.setNom(from.getNom());
        }

        if (from.getDuree() != null) {
            to.setDuree(from.getDuree());
        }

    }
}
