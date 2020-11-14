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
public class Kalpa implements ITietojenNouto {
   

    @Override
    public ArrayList<Pelaaja> getPelaajaTiedot() {
        //String etunimi, String sukunimi, String pelipaikka, 
        // String joukkue, int vakuutusnro, int pelaajaid
        ArrayList<Pelaaja> pelaajat = new ArrayList<>();
        pelaajat.add(new Pelaaja("Mikko", "Mallikas", "Oikea puolustaja", "Kalpa", 21, 12));
        pelaajat.add(new Pelaaja("Pekka", "Mainio", "Vasen puolustaja", "Kalpa", 26, 20));
        pelaajat.add(new Pelaaja("John", "Smith", "Maalivahti", "Kalpa", 10, 64));
        return pelaajat;
    }
    

}
