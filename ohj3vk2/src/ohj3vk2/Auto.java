/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk2;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
public class Auto {
    private String rekisterinro, merkki, malli;
    private int vuosimalli;
    public Auto() {
    }
    public Auto(String rekisterinro,String merkki,String malli,int vuosimalli) {
        this.rekisterinro = rekisterinro;
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
    }
    public Auto(String merkki, String malli, int vuosimalli) {
        this.malli = malli;
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
    }

    public String getRekisterinro() {
        return rekisterinro;
    }

    public void setRekisterinro(String rekisterinro) {
        if(rekisterinro.contains("-")&&rekisterinro.length() <=7) {
            this.rekisterinro = rekisterinro;
        }
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

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        if(vuosimalli >= 1900) {
            this.vuosimalli = vuosimalli;
        } else {
            this.vuosimalli = 1900;
        }
    }
    public String toString() {
        return "Malli: "+this.malli + "\nVuosimalli: "+this.vuosimalli+"\nMerkki: "
                +this.merkki+"\nRekisterinumero: "+this.rekisterinro;
    }
    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rekisterinumero:");
        this.setRekisterinro(sc.nextLine());
        System.out.println("Merkki:");
        this.setMerkki(sc.nextLine());
        System.out.println("Malli:");
        this.setMalli(sc.nextLine());
        System.out.println("Vuosimalli:");
        this.setVuosimalli(Integer.parseInt(sc.nextLine()));
    }

    
}
