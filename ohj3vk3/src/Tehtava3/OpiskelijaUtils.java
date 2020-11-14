/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava3;

import Tehtava3.Opiskelija;

/**
 *
 * @author Tommi
 */
public class OpiskelijaUtils {
    public static Opiskelija TarkistaTiedot(Opiskelija o) {
        if(o.getEtunimi()==null||o.getOpiskelijanro()==null||
                o.getOsoite()==null||o.getSukunimi()==null) {
            return null;
        }
        String etunimi = o.getEtunimi().substring(0, 1).toUpperCase() + o.getEtunimi().substring(1).toLowerCase();
        String sukunimi =  o.getSukunimi().substring(0, 1).toUpperCase() + o.getSukunimi().substring(1).toLowerCase();
        
        o.setEtunimi(etunimi);
        o.setSukunimi(sukunimi);
        
        for (char ch : o.getOpiskelijanro().toCharArray()) {
            if(!Character.isDigit(ch)) {
                return null;
            }
        }
        return o;
    }
}
