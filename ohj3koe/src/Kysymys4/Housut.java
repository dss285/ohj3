/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys4;
/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class Housut {
    // Variables
    private double hinta;
    private String koko;
    private String vari;

    public Housut(double hinta, String koko, String vari) {
        this.hinta = hinta;
        this.koko = koko;
        this.vari = vari;
    }
    @Override
    public String toString() {
        return "Hinte:" +hinta+"€, Koko: "+koko+", Väri:"+vari;
    }
}
