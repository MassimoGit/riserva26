package com.corso.riserva.service;

import com.corso.riserva.entity.Animale;
import com.corso.riserva.entity.Specie;
import com.corso.riserva.repository.AnimaleRepository;
import com.corso.riserva.repository.SpecieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimaleService {

    private final AnimaleRepository animaleRepository;

    private final SpecieRepository specieRepository;

    public List<Animale> getAll() {
        return animaleRepository.findAll();
    }

    public Animale create(Animale animale) {
        Specie specie = specieRepository.findById(animale.getSpecie().getId()).orElseThrow();
        animale.setSpecie(specie);
        return animaleRepository.save(animale);
    }

    public Animale edit(Long id, Animale animale) {
        Specie specie = specieRepository.findById(animale.getSpecie().getId()).orElseThrow();
        animale.setId(id);
        animale.setSpecie(specie);
        return animaleRepository.save(animale);
    }

    public void delete(Long id) {
        animaleRepository.deleteById(id);
    }
}
