/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava1;
/**
 * @author Tommi
 * @date Jan 30, 2020
 */
public class Opiskelija extends Henkilo {


    // Variables
    private int opiskelijanumero;
    private String aloituspaiva;
    // Constructors
    public Opiskelija(int opiskelijanumero, String aloituspaiva, String nimi, String osoite, String syntymaaika) {
        super(nimi, osoite, syntymaaika);
        this.opiskelijanumero = opiskelijanumero;
        this.aloituspaiva = aloituspaiva;
    }
    // Methods

    public int getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public String getAloituspaiva() {
        return aloituspaiva;
    }

    public void setAloituspaiva(String aloituspaiva) {
        this.aloituspaiva = aloituspaiva;
    }
    
    public String tulostaOpiskelija() {
      return super.getHenkilonTiedot() + "\n"
              +this.getOpiskelijanumero()+", "
              +this.getAloituspaiva();
    }



}
