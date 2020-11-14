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
public class Juhlahousut extends Housut {

    // Variables
    String materiaali;
    String kuvio;

    // Constructors

    public Juhlahousut(String materiaali, String kuvio, double hinta, String koko, String vari) {
        super(hinta, koko, vari);
        this.materiaali = materiaali;
        this.kuvio = kuvio;
    }

    public Juhlahousut(double hinta, String koko, String vari) {
        super(hinta, koko, vari);
    }

    // Methods
    public String getMateriaali() {
        return materiaali;
    }

    public void setMateriaali(String materiaali) {
        this.materiaali = materiaali;
    }

    public String getKuvio() {
        return kuvio;
    }

    public void setKuvio(String kuvio) {
        this.kuvio = kuvio;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", Materiaali: "+this.materiaali
                +", Kuvio: "+this.kuvio;
    }
}
