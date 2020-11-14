/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ohj3vk7;
/**
 * @author Tommi
 * @date Feb 20, 2020
 */
public class Mittaus {

    // Variables
    private String sijainti;
    private double lampotila;
    private double ph;
    // Constructors

    public Mittaus(String sijainti, double lampotila, double ph) {
        this.sijainti = sijainti;
        this.lampotila = lampotila;
        this.ph = ph;
    }

    public Mittaus() {
    }

    // Methods

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public double getLampotila() {
        return lampotila;
    }

    public void setLampotila(double lampotila) {
        this.lampotila = lampotila;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

}
