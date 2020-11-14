/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk4;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
import java.util.ArrayList;
import Tehtava1.Henkilo;
import Tehtava1.Opiskelija;
import Tehtava1.Henkilokunta;
import Tehtava3.Tietokone;
public class Ohj3vk4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Tehtava1 testaus
                int opiskelijanumero, String aloituspaiva, String nimi, String osoite, String syntymaaika
                String tyontekijanumero, String toimipaikka, String titteli, String nimi, String osoite, String syntymaaika
         */
        Opiskelija op = new Opiskelija(212121, "31.8.2019", "Tommi", "microkatu", "31.8.2019");
        Henkilokunta hk = new Henkilokunta("21212", "kuopio", "titteli", "nimi", "osoite", "31.8.2019");
        System.out.println(op.tulostaOpiskelija());
        System.out.println(hk.tulostaHenkilokunta());
        System.out.println("----------------------------------------");
        /*
            Tehtava2 testaus
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Henkilo> lista = new ArrayList<Henkilo>();
        while (true) {
            System.out.println("Lisätäänkö henkilö? (k/e)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("e")) {
                break;
            } else if (s.equalsIgnoreCase("k")) {
                System.out.println("Henkilön tiedot");
                System.out.println("Nimi:");
                String nimi = sc.nextLine();
                System.out.println("Osoite");
                String osoite = sc.nextLine();
                System.out.println("Syntymäaika");
                String syntymaaika = sc.nextLine();
                System.out.println("Opiskelija vai henkilökuntaa? (o/h)");
                String kumpi = sc.nextLine();
                if (kumpi.equalsIgnoreCase("o")) {
                    /*
                    int opiskelijanumero, 
                    String aloituspaiva, 
                    String nimi, 
                    String osoite, 
                    String syntymaaika
                    
                     */
                    System.out.println("Opiskelija numero");
                    int opiskelijanumero = Integer.parseInt(sc.nextLine());
                    System.out.println("Aloituspäivä");
                    String aloituspaiva = sc.nextLine();
                    lista.add(new Opiskelija(opiskelijanumero,
                            aloituspaiva,
                            nimi, osoite,
                            syntymaaika));
                } else if (kumpi.equalsIgnoreCase("h")) {
                    /*
                    String tyontekijanumero, 
                    String toimipaikka, 
                    String titteli, 
                    String nimi, 
                    String osoite, 
                    String syntymaaika
                     */
                    System.out.println("Työntekijänumero");
                    String tyontekijanumero = sc.nextLine();
                    System.out.println("Toimipaikka");
                    String toimipaikka = sc.nextLine();
                    System.out.println("Titteli");
                    String titteli = sc.nextLine();
                    lista.add(new Henkilokunta(tyontekijanumero,
                            toimipaikka, titteli,
                            nimi, osoite,
                            syntymaaika
                    ));
                }

            }
        }
        for (Henkilo h : lista) {
            if (h instanceof Henkilokunta) {
                Henkilokunta tmp = (Henkilokunta) h;
                System.out.println(tmp.tulostaHenkilokunta());
            }
        }

        for (Henkilo h : lista) {
            if (h instanceof Opiskelija) {
                Opiskelija tmp = (Opiskelija) h;
                System.out.println(tmp.tulostaOpiskelija());
            }
        }
        System.out.println("-------------------------");
        /*
        
        Tehtävä3
        String merkki, 
        String malli, 
        int maara, 
        int tuotepaikka, 
        String tuotenumero
        */
        Tietokone a = new Tietokone("IBM", "BS5", 5, 3, "as212a");
        Tietokone b = new Tietokone("so", "as5", 8, 2, "as22112a");
        System.out.println(a);
        System.out.println(b);
        /*
        
        Tehtävä 4
        */
        ArrayList<Tietokone> lst = new ArrayList<>();
        lst.add(new Tietokone("Asus", "ER443", 3, 12, "212232"));
        lst.add(new Tietokone("Lenovo", "HH544", 21, 15, "3233"));
        lst.add(new Tietokone("Fujitsu", "3233F", 5, 2, "9888"));
        lst.add(new Tietokone("IBM", "IBM3444", 2, 150, "343"));
        
        for (Tietokone t : lst) {
            System.out.println(t);
        }
    }
}
