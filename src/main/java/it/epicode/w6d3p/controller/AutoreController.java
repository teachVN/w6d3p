package it.epicode.w6d3p.controller;

import it.epicode.w6d3p.model.Autore;

import it.epicode.w6d3p.model.AutoreRequest;
import it.epicode.w6d3p.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class AutoreController {
    @Autowired
    private AutoreService autoreService;
    @GetMapping("/autori")
    public Page<Autore> getAll(Pageable pageable){

        return autoreService.cercaTuttiGliAutori(pageable);
    }
    @GetMapping("/autori/{id}")
    public Autore getAutoreById(@PathVariable int id){
        return autoreService.cercaAutorePerId(id);

    }
    @PostMapping("/autori")
    public Autore saveAutore(@RequestBody AutoreRequest autoreRequest){
        return autoreService.salvaAutore(autoreRequest);
    }
    @PutMapping("/autori/{id}")
    public Autore updateAutore(@PathVariable int id, @RequestBody AutoreRequest autoreRequest){
        return autoreService.aggiornaAutore(id, autoreRequest);
    }

    @DeleteMapping("/autori/{id}")
    public void deleteAutore(@PathVariable int id){
        autoreService.cancellaAutore(id);
    }


}
