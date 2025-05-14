package org.example.model;

import java.time.LocalDate;

public final class TrainDeVie extends Possession{
    private final double montantMensuel;

    public TrainDeVie(String libelle, LocalDate dateDebut, double montantMensuel) {
        super(libelle, dateDebut);
        this.montantMensuel = montantMensuel;
    }

    @Override
    public double getValeurActuelle(LocalDate dateEvaluation) {
        return 0;
    }

}
