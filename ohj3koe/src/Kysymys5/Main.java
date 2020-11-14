/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys5;

import java.util.ArrayList;

/**
 *
 * @author Tommi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalpa k = new Kalpa();
        IPK i = new IPK();
        
        ArrayList<Pelaaja> kalpanpelaajat = k.getPelaajaTiedot();
        ArrayList<Pelaaja> IPKpelaajat = i.getPelaajaTiedot();
        
        for (Pelaaja p : kalpanpelaajat) {
            p.tulostaPelaajanTiedot();
        }
        for(Pelaaja p : IPKpelaajat) {
            p.tulostaPelaajanTiedot();
        }
    }
    
}
