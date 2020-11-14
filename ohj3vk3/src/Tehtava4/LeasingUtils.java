/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava4;

/**
 *
 * @author Tommi
 */
public class LeasingUtils {
    public static LeasingTieto KopioiTiedot(LeasingTieto ls) {
       
        Tietokone t = new Tietokone(ls.getTietokone().getMerkki(), ls.getTietokone().getMalli());
        LeasingTieto n = new LeasingTieto(t,ls.getPaivamaara());
        
        return n;
    }
}
