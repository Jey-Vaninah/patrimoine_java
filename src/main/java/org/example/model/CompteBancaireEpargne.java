package org.example.model;

import java.time.LocalDate;

public final class CompteBancaireEpargne extends Argent {

    public CompteBancaireEpargne(String libelle, LocalDate dateDebut, double montant) {
        super(libelle, dateDebut, montant);
    }
}
