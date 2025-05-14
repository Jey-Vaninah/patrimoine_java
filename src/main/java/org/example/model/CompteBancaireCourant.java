package org.example.model;

import java.time.LocalDate;

public final class CompteBancaireCourant extends Argent {

    public CompteBancaireCourant(String libelle, LocalDate dateDebut, double montant) {
        super(libelle, dateDebut, montant);
    }
}
