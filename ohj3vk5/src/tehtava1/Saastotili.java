/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava1;
/**
 * @author Tommi
 * @date Feb 6, 2020
 */
public class Saastotili extends Tili {



    // Variables

    // Constructors
    public Saastotili() {    
        super();
    }

    public Saastotili(String Tilinumero, String Omistaja, double SaldoEuroa, double Vuosikorko) {
        super(Tilinumero, Omistaja, SaldoEuroa, Vuosikorko);
    }
    

    // Methods
    @Override
    public double laskeVuosikorkotuotto() {
        return super.getSaldoEuroa()*(super.getVuosikorko()/100);
    }

    @Override
    public void tulostaTilintiedot() {
        System.out.println(super.getOmistaja()+
                ", Säästötilin saldo on:"+
                super.getSaldoEuroa()+
                ", korkoprosentilla "+
                super.getVuosikorko()+"% vuosikorko on "+
                this.laskeVuosikorkotuotto());
    }
}
