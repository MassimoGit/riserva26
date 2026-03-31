package com.corso.riserva.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "animali")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer eta;

    private Double peso;

    @ManyToOne
    @JoinColumn(name = "specie_id")
    private Specie specie;
}
