package org.example.model;

import java.time.LocalDate;

public sealed class Argent extends Possession permits Espece, CompteBancaireCourant, CompteBancaireEpargne{
    private double montant;

    public Argent(String libelle, LocalDate dateDebut,double montant) {
        super(libelle, dateDebut);
        this.montant = montant;
    }

    @Override
    public double getValeurActuelle(LocalDate dateEvaluation) {
        return montant;
    }
}
