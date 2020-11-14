/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk2;

/**
 *
 * @author Tommi
 */
public class Opiskelija {
    private String etunimi, sukunimi, opiskelijanro;
    private Osoite osoite;
    public Opiskelija(String etunimi,String sukunimi,Osoite osoite, String opiskelijanro) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.osoite = osoite;
        this.opiskelijanro = opiskelijanro;
    }
    public Opiskelija() {
        
    }
    public String getEtunimi() {
        return this.etunimi;
    }
    public String getSukunimi() {
        return this.sukunimi;
    }
    public Osoite getOsoite() {
        return this.osoite;
    }
    public String getOpiskelijanro() {
        return this.opiskelijanro;
    }
    
    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }
    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }
    public void setOsoite(Osoite osoite) {
        this.osoite = osoite;
    }
    public void setOpiskelijanro(String opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }

    @Override
    public String toString() {
        return "Opiskelija{" + "etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", osoite=" + osoite + ", opiskelijanro=" + opiskelijanro + '}';
    }

}
