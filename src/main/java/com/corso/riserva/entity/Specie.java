package com.corso.riserva.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeComune;

    private String nomeScientifico;

    private String descrizione;
}
