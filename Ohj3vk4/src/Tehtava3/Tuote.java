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
public class Tuote {

    // Variables
    private int maara, tuotepaikka;
    private String tuotenumero;
    // Constructors

    public Tuote(int maara, int tuotepaikka, String tuotenumero) {
        this.maara = maara;
        this.tuotepaikka = tuotepaikka;
        this.tuotenumero = tuotenumero;
    }
    public Tuote(String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }

    public Tuote() {
    }
    // Methods

    public int getMaara() {
        return maara;
    }

    public void setMaara(int maara) {
        this.maara = maara;
    }

    public int getTuotepaikka() {
        return tuotepaikka;
    }

    public void setTuotepaikka(int tuotepaikka) {
        this.tuotepaikka = tuotepaikka;
    }

    public String getTuotenumero() {
        return tuotenumero;
    }

    public void setTuotenumero(String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }
}
