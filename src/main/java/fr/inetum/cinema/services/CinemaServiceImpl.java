package fr.inetum.cinema.services;

import fr.inetum.cinema.models.Cinema;
import fr.inetum.cinema.repositories.CinemaRepository;
import fr.inetum.cinema.services.interfaces.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CinemaServiceImpl implements CinemaService {

    private CinemaRepository cinemaRepository;

    @Autowired
    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public List<Cinema> findAll() {
        return this.cinemaRepository.findAll();
    }

    @Override
    public Cinema findById(String id) {
        return this.cinemaRepository.findById(id).orElse(null);
    }

    @Override
    public Cinema create(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Cinema put(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Cinema patch(Cinema cinema, String id) {
        Cinema savedCinema = this.cinemaRepository.findById(id).orElse(null);

        map(cinema, savedCinema);

        assert savedCinema != null;
        return this.cinemaRepository.save(savedCinema);
    }

    @Override
    public void deleteById(String id) {
        this.cinemaRepository.deleteById(id);
    }


    private static void map(Cinema from, Cinema to) {
        if (from.getNom() != null) {
            to.setNom(from.getNom());
        }

        if (from.getSalles() != null) {
            to.setSalles(from.getSalles());
        }
    }
}
