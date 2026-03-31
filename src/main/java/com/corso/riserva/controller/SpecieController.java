package com.corso.riserva.controller;

import com.corso.riserva.entity.Specie;
import com.corso.riserva.service.SpecieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SpecieController {

    private final SpecieService specieService;

    @GetMapping("/specie")
    public List<Specie> getAll() {
        return specieService.getAll();
    }

    @PostMapping("/specie/create")
    public Specie create(@RequestBody Specie specie) {
        return specieService.create(specie);
    }

    @PutMapping("/specie/edit/{id}")
    public Specie edit(@PathVariable Long id, @RequestBody Specie specie) {
        return specieService.edit(id, specie);
    }

    @DeleteMapping("/specie/delete/{id}")
    public void delete(@PathVariable Long id) {
        specieService.delete(id);
    }
}
