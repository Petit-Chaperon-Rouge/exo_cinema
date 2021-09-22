package fr.inetum.cinema.controllers;

import fr.inetum.cinema.models.Seance;
import fr.inetum.cinema.services.interfaces.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("seances")
public class SeanceController {

    private SeanceService seanceService;

    @Autowired
    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    
    @GetMapping
    public List<Seance> findAll() {
        return this.seanceService.findAll();
    }

    @GetMapping("{id}")
    public Seance findById(@PathVariable String id) {
        return this.seanceService.findById(id);
    }

    @PostMapping
    public Seance create(@RequestBody Seance seance) {
        return this.seanceService.create(seance);
    }

    @PutMapping
    public Seance put(@RequestBody Seance seance) {
        return this.seanceService.put(seance);
    }

    @PatchMapping("{id}")
    public Seance patch(@RequestBody Seance seance, @PathVariable String id) {
        return this.seanceService.patch(seance, id);
    }

    @DeleteMapping("{id]")
    public void deleteById(@PathVariable String id) {
        this.seanceService.deleteById(id);
    }


}
