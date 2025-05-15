package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
public class Patrimoine {
    private Personne proprietaire;
    private final LocalDate date;
    private final Double valeur;
    private final Set<Possession> possessions;
}
