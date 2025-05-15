package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Devise {
    private final String nom;
    private final double tauxDeConversionVersAriary;

    public double convertirEnAriary(double valeur) {
        return tauxDeConversionVersAriary * valeur;
    }

    public static Devise ARIARY() {
        return new Devise("ARIARY", 1.0);
    }

    public static Devise EURO(){
        return new Devise("EURO",4800.0 );
    }

    public static Devise Franc(){
        return new Devise("FRANC",1.0 / 5.0 );
    }
}
