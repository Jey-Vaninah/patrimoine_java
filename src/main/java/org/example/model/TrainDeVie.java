package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class TrainDeVie extends Possession{

    protected TrainDeVie(String nomDeLaPossession, LocalDate aDateDe, Argent valeur) {
        super(nomDeLaPossession, aDateDe, valeur);
    }

    @Override
    public Possession projectionFucture(LocalDate dateFuture) {
        return new TrainDeVie(
             getNomDeLaPossession(),
             dateFuture,
             getValeur()
        );
    }
}
