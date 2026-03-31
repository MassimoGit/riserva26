package com.corso.riserva.controller;

import com.corso.riserva.entity.Animale;
import com.corso.riserva.service.AnimaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnimaleController {

    private final AnimaleService animaleService;

    @GetMapping("/animali")
    public List<Animale> getAll() {
        return animaleService.getAll();
    }

    @PostMapping("/animali/create")
    public Animale create(@RequestBody Animale animale) {
        return animaleService.create(animale);
    }

    @PutMapping("/animali/edit/{id}")
    public Animale edit(@PathVariable Long id, @RequestBody Animale animale) {
        return animaleService.edit(id, animale);
    }

    @DeleteMapping("/animali/delete/{id}")
    public void delete(@PathVariable Long id) {
        animaleService.delete(id);
    }
}
