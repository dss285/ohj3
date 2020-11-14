/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ohj3vk7;
/**
 * @author Tommi
 * @date Feb 20, 2020
 */
import java.util.HashMap;
public class tehtava1 {
    private static HashMap<Integer, Character> merkit = new HashMap<>();
    // Methods
    public static double ympyranAla(int sade) {
        return Math.round((Math.PI*sade*sade)*100.0)/100.0;
    }
    public static boolean tarkistaSotu(String sotu) {
        if(merkit.isEmpty()) {
            merkitSet();
        }
        if(sotu.length() == 11) {
            String paivays = sotu.substring(0, 6);
            String valimerkki = sotu.substring(6, 7);
            String kokonaisluku = sotu.substring(7,10);
            String tarkistusmerkki = sotu.substring(10,11);
        
            double jako = Double.parseDouble(paivays+kokonaisluku)/31;
            jako = jako - Math.floor(jako);
            int numero = (int)Math.round(jako*31);
            String merkki = merkit.get(numero).toString();
            if(merkki.equals(tarkistusmerkki)) {
                System.out.println("ok");
                return true;
            }

            
        }
        return false;
    }
    public static String muunna(String s) {
        s = s.replaceAll(" ", "");
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        return s;
    }
    private static void merkitSet() {
        char[] merkitStr = "0123456789ABCDEFHJKLMNPRSTUVWXY".toCharArray();
        
        int i = 0;
        while(i < merkitStr.length) {
            merkit.put(i, merkitStr[i]);
            i++;
        }
    }
}
