/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava3;
/**
 * @author Tommi
 * @date Feb 1, 2020
 */
public class Tietokone extends Tuote {

    // Variables
private String merkki, malli;
    // Constructors

    public Tietokone(String merkki, String malli, int maara, int tuotepaikka, String tuotenumero) {
        super(maara, tuotepaikka, tuotenumero);
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone(String merkki, String malli, String tuotenumero) {
        super(tuotenumero);
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone() {
    }
    // Methods
    @Override
    public int getTuotepaikka() {
        if(super.getTuotepaikka() < 10) {
            return super.getTuotepaikka()+10;
        } else if (super.getTuotepaikka() <= 100) {
            return super.getTuotepaikka()+30;
        } else {
            return super.getTuotepaikka()+500;
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

    @Override
    public String toString() {
        return "Merkki:" + merkki + ", Malli:" + malli + ", "+ "Tuotenumero:"
                + super.getTuotenumero() + ", Tuotepaikka:"
                + this.getTuotepaikka() + ", Määrä:"
                + super.getMaara();
    }



}
