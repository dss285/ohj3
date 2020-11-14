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
import java.util.Scanner;
public class Kayttaja {
    
    private String nimi;
    private String osoite;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

   

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }
    public void kysyTiedot(Scanner sc) {
        System.out.println("Nimi");
        this.setNimi(sc.nextLine());
        System.out.println("Osoite");
        this.setOsoite(sc.nextLine());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Kayttaja{" + "nimi=" + nimi + ", osoite=" + osoite + '}';
    }

}
