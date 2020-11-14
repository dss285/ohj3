/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava4;

import java.util.Scanner;

/**
 * @author Tommi
 * @date Feb 13, 2020
 */
public class Viesti {

    // Variables
    private String VastaanottajanNimi;
    private String VastaanottajanNumero;
    private String Viesti;

    // Constructors

    public Viesti(String VastaanottajanNimi, String VastaanottajanNumero, String Viesti) {
        this.VastaanottajanNimi = VastaanottajanNimi;
        this.VastaanottajanNumero = VastaanottajanNumero;
        this.Viesti = Viesti;
    }

    public Viesti() {
    }

    // Methods
    public String getVastaanottajanNimi() {
        return VastaanottajanNimi;
    }

    public void setVastaanottajanNimi(String VastaanottajanNimi) {
        this.VastaanottajanNimi = VastaanottajanNimi;
    }

    public String getVastaanottajanNumero() {
        return VastaanottajanNumero;
    }

    public void setVastaanottajanNumero(String VastaanottajanNumero) {
        this.VastaanottajanNumero = VastaanottajanNumero;
    }

    public String getViesti() {
        return Viesti;
    }

    public void setViesti(String Viesti) {
        this.Viesti = Viesti;
    }

    @Override
    public String toString() {
        return "Vastaanottajan Nimi: " + VastaanottajanNimi 
                + ", Vastaanottajan Numero:" 
                + VastaanottajanNumero + ", Viesti:" + Viesti;
    }
    public void kysyTiedot(Scanner sc) {
        System.out.println("Vastaanottajan nimi:");
        this.setVastaanottajanNimi(sc.nextLine());
        System.out.println("Vastaanottajan numero:");
        this.setVastaanottajanNumero(sc.nextLine());
        System.out.println("Viesti:");
        this.setViesti(sc.nextLine());
    }

}
