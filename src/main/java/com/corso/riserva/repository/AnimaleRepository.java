package com.corso.riserva.repository;

import com.corso.riserva.entity.Animale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimaleRepository extends JpaRepository<Animale, Long> {
}
