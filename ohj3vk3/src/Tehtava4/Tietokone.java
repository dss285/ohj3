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
public class Tietokone {
    
    private String merkki;
    private String malli;
    private int sarjanumero;

    public Tietokone() {
    }

    public Tietokone(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone(String merkki, String malli, int sarjanumero) {
        this.merkki = merkki;
        this.malli = malli;
        this.sarjanumero = sarjanumero;
    }

    
    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    

    public int getSarjanumero() {
        return sarjanumero;
    }

    public void setSarjanumero(int sarjanumero) {
        this.sarjanumero = sarjanumero;
    }
    public void kysyTiedot(Scanner sc) {
        System.out.println("Tietokoneen tiedot:\n");
        System.out.println("Merkki:");
        this.setMerkki(sc.nextLine());
        System.out.println("Malli:");
        this.setMalli(sc.nextLine());
        System.out.println("Sarjanumero:");
        this.setSarjanumero(Integer.parseInt(sc.nextLine()));
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Tietokone{" + "merkki=" + merkki + ", malli=" + malli + ", sarjanumero=" + sarjanumero + '}';
    }

}
