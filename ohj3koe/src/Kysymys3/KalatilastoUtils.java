/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys3;

import java.util.ArrayList;

/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class KalatilastoUtils {
    // Methods
    public static ArrayList<Kalastaja> palautaKalastajat(String sijainti, ArrayList<Kalastaja> kalastajat) {
        ArrayList<Kalastaja> lista = new ArrayList<>();
        for(Kalastaja k : kalastajat) {
            if(k.getSijainti().equals(sijainti)) {
                lista.add(k);
            }
        }
        return lista;
    }
    public static double saalisYht(ArrayList<Kalastaja> kalastajat) {
        double yht = 0;
        for(Kalastaja k : kalastajat) {
            yht += k.getHaukisaalisKg();
            yht += k.getKuhasaalisKg();
        }
        return yht;
    }

}