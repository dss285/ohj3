/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys3;
/**
 * @author Tommi
 * @date Feb 27, 2020
 * Kaloilla ei ollut mitää suurempaa roolia kuin paino niin ei kannattanut tehdä uutta luokkaa,
 * mutta mikäli niitä käytettäisiin jossain määrin enemmän niin kannattaisi.
 */
public class Kalastaja {

    
    // Variables
    private String nimi;
    private String sijainti;
    private int jasennumero;
    private double haukisaalisKg;
    private double kuhasaalisKg;
    private double suurinKuha;
    private double suurinHauki;
    // Constructors

    public Kalastaja(String nimi, String sijainti, int jasennumero, double haukisaalisKg, double kuhasaalisKg, double suurinKuha, double suurinHauki) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.jasennumero = jasennumero;
        this.haukisaalisKg = haukisaalisKg;
        this.kuhasaalisKg = kuhasaalisKg;
        this.suurinKuha = suurinKuha;
        this.suurinHauki = suurinHauki;
    }


    
    public Kalastaja() {
    }
    // Methods

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public double getHaukisaalisKg() {
        return haukisaalisKg;
    }

    public void setHaukisaalisKg(double haukisaalisKg) {
        this.haukisaalisKg = haukisaalisKg;
    }

    public double getKuhasaalisKg() {
        return kuhasaalisKg;
    }

    public void setKuhasaalisKg(double kuhasaalisKg) {
        this.kuhasaalisKg = kuhasaalisKg;
    }

    public double getSuurinKuha() {
        return suurinKuha;
    }

    public void setSuurinKuha(double suurinKuha) {
        this.suurinKuha = suurinKuha;
    }

    public double getSuurinHauki() {
        return suurinHauki;
    }

    public void setSuurinHauki(double suurinHauki) {
        this.suurinHauki = suurinHauki;
    }

    public int getJasennumero() {
        return jasennumero;
    }

    public void setJasennumero(int jasennumero) {
        this.jasennumero = jasennumero;
    }

    @Override
    public String toString() {
        return nimi + ", "+this.jasennumero+", "+this.sijainti+
                ", Saalis:  hauki yht: "+this.haukisaalisKg+"kg, suurin " +this.suurinHauki
                +"kg, kuha yht: "+this.kuhasaalisKg+"kg, suurin "+this.suurinKuha;
    }

    


}
