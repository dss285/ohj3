/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys3;

/**
 *
 * @author Tommi
 */
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ohjelma ohj = new Ohjelma();
        ArrayList<Kalastaja> lista = ohj.getKalastajat();
        ArrayList<Kalastaja> kallavedenkalastajat = KalatilastoUtils.palautaKalastajat("Kallavesi", lista);
        double summa = KalatilastoUtils.saalisYht(lista);
        
        System.out.println("Summa: "+summa);
        System.out.println("Kallaveden kalastajat:\n"+kallavedenkalastajat.toString());
    }
    
}
