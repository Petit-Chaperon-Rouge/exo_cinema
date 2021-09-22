package fr.inetum.cinema.services;

import fr.inetum.cinema.models.Seance;
import fr.inetum.cinema.repositories.SeanceRepository;
import fr.inetum.cinema.services.interfaces.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeanceServiceImpl implements SeanceService {

    private SeanceRepository seanceRepository;

    @Autowired
    public SeanceServiceImpl(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }


    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance findById(String id) {
        return this.seanceRepository.findById(id).orElse(null);
    }

    @Override
    public Seance create(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance put(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance patch(Seance seance, String id) {
        Seance savedSeance = this.seanceRepository.findById(id).orElse(null);

        map(seance, savedSeance);

        assert savedSeance != null;
        return this.seanceRepository.save(savedSeance);
    }

    @Override
    public void deleteById(String id) {
        this.seanceRepository.deleteById(id);
    }


    private static void map(Seance from, Seance to) {
        if (from.getFilm() != null) {
            to.setFilm(from.getFilm());
        }

        if (from.getDate() != null) {
            to.setDate(from.getDate());
        }
    }
}
