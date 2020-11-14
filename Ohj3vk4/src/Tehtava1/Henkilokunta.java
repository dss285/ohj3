/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava1;
/**
 * @author Tommi
 * @date Jan 30, 2020
 */
public class Henkilokunta extends Henkilo {

    // Variables
    private String tyontekijanumero, toimipaikka, titteli;
    // Constructors

    public Henkilokunta(String tyontekijanumero, String toimipaikka, String titteli, String nimi, String osoite, String syntymaaika) {
        super(nimi, osoite, syntymaaika);
        this.tyontekijanumero = tyontekijanumero;
        this.toimipaikka = toimipaikka;
        this.titteli = titteli;
    }
    
    // Methods

    public String getTyontekijanumero() {
        return tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        this.tyontekijanumero = tyontekijanumero;
    }

    public String getToimipaikka() {
        return toimipaikka;
    }

    public void setToimipaikka(String toimipaikka) {
        this.toimipaikka = toimipaikka;
    }

    public String getTitteli() {
        return titteli;
    }

    public void setTitteli(String titteli) {
        this.titteli = titteli;
    }

    public String tulostaHenkilokunta() {
        return super.getHenkilonTiedot() + "\n"+
                this.getTyontekijanumero()+", "+
                this.getToimipaikka()+", "+
                this.getTitteli();
    }

}
