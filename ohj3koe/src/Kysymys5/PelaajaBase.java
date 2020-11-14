/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys5;
/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public abstract class PelaajaBase {

    // Variables
    private String joukkue;
    private int vakuutusnro;
    private int pelaajaid;
    // Constructors

    public PelaajaBase(String joukkue, int vakuutusnro, int pelaajaid) {
        this.joukkue = joukkue;
        this.vakuutusnro = vakuutusnro;
        this.pelaajaid = pelaajaid;
    }
    
    
    // Methods
    public abstract void tulostaPelaajanTiedot();
    @Override
    public String toString() {
        return "Joukkue: "+this.joukkue
                +", Vakuutusnumero: "+this.vakuutusnro
                +", Pelaajatunnus: "+this.pelaajaid;
    }

}
