package fr.inetum.cinema.controllers;

import fr.inetum.cinema.models.Cinema;
import fr.inetum.cinema.services.interfaces.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("cinemas")
public class CinemaController {
    
    private CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }
    
    @GetMapping
    public List<Cinema> findAll() {
        return this.cinemaService.findAll();
    }

    @GetMapping("{id}")
    public Cinema findById(@PathVariable String id) {
        return this.cinemaService.findById(id);
    }

    @PostMapping
    public Cinema create(@RequestBody Cinema cinema) {
        return this.cinemaService.create(cinema);
    }

    @PutMapping
    public Cinema put(@RequestBody Cinema cinema) {
        return this.cinemaService.put(cinema);
    }

    @PatchMapping("{id}")
    public Cinema patch(@RequestBody Cinema cinema, @PathVariable String id) {
        return this.cinemaService.patch(cinema, id);
    }

    @DeleteMapping("{id]")
    public void deleteById(@PathVariable String id) {
        this.cinemaService.deleteById(id);
    }
    
}
