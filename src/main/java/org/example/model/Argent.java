package org.example.model;

import java.time.LocalDate;

public final class Argent extends Possession {
    private double montant;

    public Argent(String libelle, LocalDate dateDebut,double montant) {
        super(libelle, dateDebut);
        this.montant = montant;
    }

    @Override
    public double getValeurActuelle(LocalDate dateEvaluation) {
        return montant;
    }

    public void retirer(double montant) {
        if (montant <= this.montant) {
            this.montant -= montant;
        }
    }

    public void ajouter(double montant) {
        this.montant += montant;
    }
}
