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
public class LeasingTieto {
    
    private String paivamaara;    
    private Tietokone tietokone;
    private Kayttaja kayttaja;

    public LeasingTieto() {
        this.setTietokone(new Tietokone());
        this.setKayttaja(new Kayttaja());
    }
    public LeasingTieto(Tietokone t, String pvm) {
        this.setTietokone(t);
        this.setPaivamaara(pvm);
        this.setKayttaja(new Kayttaja());
    }
    


    public Kayttaja getKayttaja() {
        return kayttaja;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }


    public Tietokone getTietokone() {
        return tietokone;
    }

    public void setTietokone(Tietokone tietokone) {
        this.tietokone = tietokone;
    }

    public String getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(String paivamaara) {
        this.paivamaara = paivamaara;
    }
    public void kysyTiedot(Scanner sc) {
        this.kayttaja.kysyTiedot(sc);
        this.tietokone.kysyTiedot(sc);
        System.out.println("Päivämäärä:");
        this.paivamaara = sc.nextLine();
        System.out.println("");
    }
    public void kysyMuutTiedot(Scanner sc) {
        this.kayttaja.kysyTiedot(sc);
        System.out.println("Sarjanumero:");
        this.tietokone.setSarjanumero(Integer.parseInt(sc.nextLine()));
        System.out.println("Päivämäärä:");
        this.setPaivamaara(sc.nextLine());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "LeasingTieto{" + "paivamaara=" + paivamaara + ", tietokone=" + tietokone + ", \nkayttaja=" + kayttaja + '}';
    }

}
