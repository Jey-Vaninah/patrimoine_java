package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class TrainDeVie extends Possession{
    private final double montantMensuel;

    public TrainDeVie(String libelle, LocalDate dateDebut, double montantMensuel) {
        super(libelle, dateDebut);
        this.montantMensuel = montantMensuel;
    }

    @Override
    public double getValeurActuelle(LocalDate dateEvaluation) {
        long mois = ChronoUnit.MONTHS.between(getDateDebut(), dateEvaluation);

        return switch ((mois < 0) ? "pas_encore_de_depenses" : "depenses_en_cours") {
            case "pas_encore_de_depenses" -> 0;
            case "depenses_en_cours" -> -mois * montantMensuel;
            default -> throw new IllegalStateException("Cas inattendu : " + mois);
        };
    }

}
