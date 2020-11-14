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
public class Henkilo {

    // Variables
    private String nimi, osoite, syntymaaika;
    // Constructors
    public Henkilo() {
    }
    public Henkilo(String nimi, String osoite, String syntymaaika) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.syntymaaika = syntymaaika;
    }
    // Methods

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getSyntymaaika() {
        return syntymaaika;
    }

    public void setSyntymaaika(String syntymaaika) {
        this.syntymaaika = syntymaaika;
    }

    protected String getHenkilonTiedot() {
        return this.getNimi()+", "+this.getOsoite()+", "+this.getSyntymaaika();
    }


}
