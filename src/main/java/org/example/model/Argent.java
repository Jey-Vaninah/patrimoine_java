package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class Argent {
    private double montant;
    private Devise devise;

    public double getMontantEnAriary() {
        return devise.convertirEnAriary(montant);
    }
}

