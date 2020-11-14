/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava1;

/**
 *
 * @author Tommi
 */
public class Osake {
    private String nimi;
    private double ostohinta;
    public Osake(String nimi, double ostohinta) {
        this.nimi = nimi;
        this.ostohinta = ostohinta;
    }
    public void TulostaArvo(double kasvuprs, int vuodet) {
        double d = this.ostohinta;
        for (int i = 0; i < vuodet; i++) {
            d += LaskeTuottoYhdelleVuodelle(kasvuprs, d);
        }
        StringBuilder sd = new StringBuilder(this.nimi);
        sd.append("Tuotto:");
        sd.append(" ");
        sd.append(d);
        System.out.println(sd);
    }
    private double LaskeTuottoYhdelleVuodelle(double kasvuprs, double hinta) {
        return hinta*(kasvuprs/100.0);
    }
}
