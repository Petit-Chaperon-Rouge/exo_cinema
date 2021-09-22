package fr.inetum.cinema.controllers;

import fr.inetum.cinema.models.Salle;
import fr.inetum.cinema.services.interfaces.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("salles")
public class SalleController {

    private SalleService salleService;

    @Autowired
    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAll() {
        return this.salleService.findAll();
    }

    @GetMapping("{id}")
    public Salle findById(@PathVariable String id) {
        return this.salleService.findById(id);
    }

    @PostMapping
    public Salle create(@RequestBody Salle salle) {
        return this.salleService.create(salle);
    }

    @PutMapping
    public Salle put(@RequestBody Salle salle) {
        return this.salleService.put(salle);
    }

    @PatchMapping("{id}")
    public Salle patch(@RequestBody Salle salle, @PathVariable String id) {
        return this.salleService.patch(salle, id);
    }

    @DeleteMapping("{id]")
    public void deleteById(@PathVariable String id) {
        this.salleService.deleteById(id);
    }
}
