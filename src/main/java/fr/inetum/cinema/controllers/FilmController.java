package fr.inetum.cinema.controllers;

import fr.inetum.cinema.models.Film;
import fr.inetum.cinema.services.interfaces.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("films")
public class FilmController {

    private FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll() {
        return this.filmService.findAll();
    }

    @GetMapping("{id}")
    public Film findById(@PathVariable String id) {
        return this.filmService.findById(id);
    }

    @PostMapping
    public Film create(@RequestBody Film film) {
        return this.filmService.create(film);
    }

    @PutMapping
    public Film put(@RequestBody Film film) {
        return this.filmService.put(film);
    }

    @PatchMapping("{id}")
    public Film patch(@RequestBody Film film, @PathVariable String id) {
        return this.filmService.patch(film, id);
    }

    @DeleteMapping("{id]")
    public void deleteById(@PathVariable String id) {
        this.filmService.deleteById(id);
    }
}
