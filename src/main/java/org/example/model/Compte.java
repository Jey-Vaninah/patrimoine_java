package org.example.model;

import java.time.LocalDate;

public final class Compte extends Possession {

    protected Compte(String nomDeLaPossession, LocalDate aDateDe, Argent valeur) {
        super(nomDeLaPossession, aDateDe, valeur);
    }

    @Override
    public Possession projectionFucture(LocalDate dateFuture) {
        return new Compte(
             getNomDeLaPossession(),
             dateFuture,
             getValeur()
        );
    }
}

