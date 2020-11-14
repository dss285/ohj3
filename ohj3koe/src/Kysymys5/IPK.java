/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys5;

import java.util.ArrayList;

/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class IPK implements ITietojenNouto {

    // Variables

    // Constructors
    public ArrayList<Pelaaja> getPelaajaTiedot() {
        //String etunimi, String sukunimi, String pelipaikka, 
        // String joukkue, int vakuutusnro, int pelaajaid
        ArrayList<Pelaaja> pelaajat = new ArrayList<>();
        pelaajat.add(new Pelaaja("Minna", "Malli", "Oikea puolustaja", "IPK", 42, 24));
        pelaajat.add(new Pelaaja("Väinö", "Asd", "Vasen puolustaja", "IPK", 56, 40));
        pelaajat.add(new Pelaaja("James", "Bond", "Maalivahti", "IPK", 20, 128));
        return pelaajat;
    }
}
