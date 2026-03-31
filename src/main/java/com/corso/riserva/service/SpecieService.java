package com.corso.riserva.service;

import com.corso.riserva.entity.Specie;
import com.corso.riserva.repository.SpecieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecieService {

    private final SpecieRepository specieRepository;

    public List<Specie> getAll() {
        return specieRepository.findAll();
    }

    public Specie create(Specie specie) {
        return specieRepository.save(specie);
    }

    public Specie edit(Long id, Specie specie) {
        specie.setId(id);
        return specieRepository.save(specie);
    }

    public void delete(Long id) {
        specieRepository.deleteById(id);
    }
}
