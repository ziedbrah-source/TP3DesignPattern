package com.company;
import java.util.*;

public class VueCatalogue {
    protected List<VueProduit> produit = new ArrayList<>();
    protected AffichageInterface version;
    public VueCatalogue(AffichageInterface version){
        produit.add(new VueProduit("PC"));
        produit.add(new VueProduit("TV"));
        produit.add(new VueProduit("TELECOMMANDE"));
        produit.add(new VueProduit("MODEM"));
        this.version = version;
    }
    public void affiche() {
        version.affiche(produit);
    }
}
