package org.example.model;

import java.time.LocalDate;

public final class Materiel extends Possession {
    private final double valeurInitiale;
    private final double tauxAmortissement;

    public Materiel(String libelle, LocalDate dateDebut, double valeurInitiale, double tauxAmortissement) {
        super(libelle, dateDebut);
        this.valeurInitiale = valeurInitiale;
        this.tauxAmortissement = tauxAmortissement;
    }

    @Override
    public double getValeurActuelle(LocalDate dateEvaluation) {
        return 0;
    }

}
