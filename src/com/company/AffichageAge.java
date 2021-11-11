package com.company;

import java.util.List;

public class AffichageAge implements AffichageInterface {

    @Override
    public void affiche(List<VueProduit> produits) {
        for(VueProduit prod : produits) {
            prod.affiche();
            System.out.println("");
        }
    }
}
