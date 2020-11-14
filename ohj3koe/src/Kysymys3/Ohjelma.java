/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class Ohjelma {
    private ArrayList<Kalastaja> kalastajat = new ArrayList<>();
    public Ohjelma() {
        this.kysyTiedot();
        System.out.println(this.toString());
    }

    // Variables

    // Constructors

    // Methods
    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Anna kalastajan jäsennumero (0 lopettaa):");
            int jasennumero = Integer.parseInt(sc.nextLine());
            if(jasennumero == 0) {
                break;
            }
            System.out.println("Anna kalastajan etunimi:");
            String etunimi = sc.nextLine();
            System.out.println("Anna kalastajan pääasiallinen kalastusalue:");
            String sijainti = sc.nextLine();
            System.out.println("Anna kalastajan haukisaalis (yht kg):");
            double haukisaalis = Double.parseDouble(sc.nextLine());
            System.out.println("Anna kalastajan kuhasaalis (yht kg):");
            double kuhasaalis = Double.parseDouble(sc.nextLine());
            System.out.println("Anna kalastajan suurin hauki (kg):");
            double suurinHauki = Double.parseDouble(sc.nextLine());
            System.out.println("Anna kalastajan suurin kuha(kg):");
            double suurinKuha = Double.parseDouble(sc.nextLine());
            //String nimi, String sijainti, int jasennumero, 
            //double haukisaalisKg, double kuhasaalisKg, double suurinKuha, double suurinHauki) {
            kalastajat.add(new Kalastaja(etunimi, sijainti, jasennumero, haukisaalis, kuhasaalis, suurinKuha, suurinHauki));
        }
    }
    @Override
    public String toString() {
       StringBuilder s = new StringBuilder("Kalastajat:\n");
       for(Kalastaja k : this.kalastajat) {
           s.append(k.toString()+"\n");
       }
       return s.toString();
    }

    public ArrayList<Kalastaja> getKalastajat() {
        return kalastajat;
    }
    

}
