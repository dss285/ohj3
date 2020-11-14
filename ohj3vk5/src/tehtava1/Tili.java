/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava1;

import java.util.Scanner;

/**
 * @author Tommi
 * @date Feb 6, 2020
 */
public abstract class Tili {

    // Variables
    private String Tilinumero, Omistaja;
    private double SaldoEuroa, Vuosikorko;
    // Constructors

    public Tili() {
    }

    public Tili(String Tilinumero, String Omistaja, double SaldoEuroa, double Vuosikorko) {
        this.setTilinumero(Tilinumero);
        this.setOmistaja(Omistaja);
        this.setSaldoEuroa(SaldoEuroa);
        this.setVuosikorko(Vuosikorko);
    }

    // Methods

    public String getTilinumero() {
        return Tilinumero;
    }

    public void setTilinumero(String Tilinumero) {
        this.Tilinumero = Tilinumero;
    }

    public String getOmistaja() {
        return Omistaja;
    }

    public void setOmistaja(String Omistaja) {
        this.Omistaja = Omistaja;
    }

    public double getSaldoEuroa() {
        return SaldoEuroa;
    }

    public void setSaldoEuroa(double SaldoEuroa) {
        this.SaldoEuroa = SaldoEuroa;
    }

    public double getVuosikorko() {
        return Vuosikorko;
    }

    public final void setVuosikorko(double Vuosikorko) {
        if(Vuosikorko > 0) {
            this.Vuosikorko = Vuosikorko;
        } else {
            throw new ArithmeticException("Negative numbers not allowed!");
        }
 
    }
    public void kysyTiedot() {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Omistaja:");
            this.setOmistaja(sc.nextLine());
            System.out.println("Tilinumero:");
            this.setTilinumero(sc.nextLine());
            System.out.println("Saldo");
            this.setSaldoEuroa(Double.parseDouble(sc.nextLine()));
            System.out.println("Vuosikorko:");
            this.setVuosikorko(Double.parseDouble(sc.nextLine()));
                  
        } catch(ArithmeticException e) {
            double d = 0;
            while(d <= 0) {
                System.out.println("Vuosikorko:");
                d = Double.parseDouble(sc.nextLine());
            }
            this.setVuosikorko(d);
        }
    }
    public abstract double laskeVuosikorkotuotto();
    public abstract void tulostaTilintiedot();
    
}
