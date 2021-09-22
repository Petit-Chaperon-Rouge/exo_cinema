package fr.inetum.cinema.services;

import fr.inetum.cinema.models.Salle;
import fr.inetum.cinema.repositories.SalleRepository;
import fr.inetum.cinema.services.interfaces.SalleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalleServiceImpl implements SalleService {

    private SalleRepository salleRepository;

    @Autowired
    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle findById(String id) {
        return this.salleRepository.findById(id).orElse(null);
    }

    @Override
    public Salle create(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle put(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle patch(Salle salle, String id) {
        Salle savedSalle = this.salleRepository.findById(id).orElse(null);

        map(salle, savedSalle);

        assert savedSalle != null;
        return this.salleRepository.save(savedSalle);
    }

    @Override
    public void deleteById(String id) {
        this.salleRepository.deleteById(id);
    }


    private static void map(Salle from, Salle to) {
        if (from.getNbPlaces() != null) {
            to.setNbPlaces(from.getNbPlaces());
        }

        if (from.getNumero() != null) {
            to.setNumero(from.getNumero());
        }

        if (from.getSeances() != null) {
            to.setSeances(from.getSeances());
        }
    }
}
