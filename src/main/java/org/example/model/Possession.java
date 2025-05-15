package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public  abstract sealed class Possession permits Compte, Materiel, TrainDeVie {
    protected String nomDeLaPossession;
    protected LocalDate aDateDe;
    protected Argent valeur;

    public abstract Possession projectionFucture(LocalDate dateFuture);
}


