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
public class Supersaastotili extends Tili {



    // Variables

    // Constructors
    
    public Supersaastotili() {
        super();
    }

    public Supersaastotili(String Tilinumero, String Omistaja, double SaldoEuroa, double Vuosikorko) {
        super(Tilinumero, Omistaja, SaldoEuroa, Vuosikorko);
    }
    // Methods

    @Override
    public double laskeVuosikorkotuotto() {
        double tuotto = 0;
        if(super.getSaldoEuroa() > 10000) {
            tuotto += 10000*(super.getVuosikorko()/100);
            tuotto += (super.getSaldoEuroa()-10000)*((super.getVuosikorko()+3)/100);
        } else {
            tuotto = super.getSaldoEuroa()*(super.getVuosikorko()/100);
        }
        return tuotto;
    }

    @Override
    public void tulostaTilintiedot() {
        System.out.println(super.getOmistaja()+
                ", Supersäästötilin saldo on:"+
                super.getSaldoEuroa()+
                ", korkoprosentilla "+
                super.getVuosikorko()+"%/"+(super.getVuosikorko()+3)+"% vuosikorko on "+
                this.laskeVuosikorkotuotto());
    }
    

}
