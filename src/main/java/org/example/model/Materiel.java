package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class Materiel extends Possession {
    private final double tauxDAppreciation;
    private final LocalDate dateDAcquisition;

    protected Materiel(String nomDeLaPossession, LocalDate aDateDe, Argent valeur, double tauxDAppreciation, LocalDate dateDAcquisition) {
        super(nomDeLaPossession, aDateDe, valeur);
        this.tauxDAppreciation = tauxDAppreciation;
        this.dateDAcquisition = dateDAcquisition;
    }

    @Override
    public Possession projectionFucture(LocalDate dateFuture) {
        long nombreDeMois = ChronoUnit.MONTHS.between(dateDAcquisition, dateFuture);

        if (nombreDeMois < 0) {
            return new Materiel(
                    getNomDeLaPossession(),
                    dateFuture,
                    new Argent(0,getValeur().getDevise()),
                    tauxDAppreciation,
                    dateDAcquisition
            );
        }

        double valeurInitiale = getValeur().getMontant();
        double coefficientMensuel = (100.0 - tauxDAppreciation) / 100.0;
        double valeurFuture = valeurInitiale * Math.pow(coefficientMensuel, nombreDeMois);

        return new Materiel(
                getNomDeLaPossession(),
                dateFuture,
                new Argent(valeurFuture,getValeur().getDevise()),
                tauxDAppreciation,
                dateDAcquisition
        );
    }
}
