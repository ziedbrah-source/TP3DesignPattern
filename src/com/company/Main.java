package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VueCatalogue vueAge = new VueCatalogue(new AffichageAge());
        VueCatalogue vueNormal = new VueCatalogue(new AffichageNormal());
        vueAge.affiche();
        vueNormal.affiche();
    }
}
