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
public class Osoite {
    private String osoite, postitoimipaikka, postinumero;
    public Osoite() {
        
    }
    public Osoite(String osoite, String postitoimipaikka, String postinumero) {
        this.setOsoite(osoite);
        this.setPostinumero(postinumero);
        this.setPostitoimipaikka(postitoimipaikka);
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getPostitoimipaikka() {
        return postitoimipaikka;
    }

    public void setPostitoimipaikka(String postitoimipaikka) {
        this.postitoimipaikka = postitoimipaikka;
    }

    public String getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(String postinumero) {
        this.postinumero = postinumero;
    }
    @Override
    public String toString() {
        return this.getOsoite()+" "+this.getPostinumero()+" "+this.getPostitoimipaikka();
    }    
}
