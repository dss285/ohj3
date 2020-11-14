/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava3;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
public class Opiskelija {
    private String etunimi, sukunimi, opiskelijanro;
    private String osoite;
    public Opiskelija(String etunimi,String sukunimi,String osoite, String opiskelijanro) {
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
    public String getOsoite() {
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
    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }
    public void setOpiskelijanro(String opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }
    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etunimi");
        this.setEtunimi(sc.nextLine());
        System.out.println("Sukunimi");
        this.setSukunimi(sc.nextLine());
        System.out.println("Opiskelija numero");
        this.setOpiskelijanro(sc.nextLine());
        System.out.println("Osoite");
        this.setOsoite(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Opiskelija{" + "etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", osoite=" + osoite + ", opiskelijanro=" + opiskelijanro + '}';
    }

}
