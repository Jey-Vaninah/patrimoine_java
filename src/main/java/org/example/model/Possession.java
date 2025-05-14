package org.example.model;

import java.time.LocalDate;

public sealed abstract class Possession permits Argent, Materiel, TrainDeVie {
    private final String libelle;
    protected LocalDate dateDebut;

    public Possession(String libelle, LocalDate dateDebut) {
        this.libelle = libelle;
        this.dateDebut = dateDebut;
    }

    public String getLibelle() {
        return libelle;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public abstract double getValeurActuelle(LocalDate dateEvaluation);
}


