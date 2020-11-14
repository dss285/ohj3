/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys5;
/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class Pelaaja extends PelaajaBase {
    private String etunimi;
    private String sukunimi;
    private String pelipaikka;

    public Pelaaja(String etunimi, String sukunimi, String pelipaikka, String joukkue, int vakuutusnro, int pelaajaid) {
        super(joukkue, vakuutusnro, pelaajaid);
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.pelipaikka = pelipaikka;
    }

    
    @Override
    public void tulostaPelaajanTiedot() {
        System.out.println(super.toString()
                +", Etunimi: "+this.etunimi
                +", Sukunimi:"+this.sukunimi
                +", Pelipaikka:"+this.pelipaikka);
    }
    

}
