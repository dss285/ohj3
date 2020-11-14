/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk5;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
import tehtava1.Supersaastotili;
import tehtava2.OmatJaYhteisetTilit;
import tehtava3ja4.Puhelin;
public class Ohj3vk5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Tehtava1
        */
        Supersaastotili tili = new Supersaastotili("121212", "omistaja", 15000, 3.5);
        tili.tulostaTilintiedot();
        /*
        Tehtava2
        */
        OmatJaYhteisetTilit ojy = new OmatJaYhteisetTilit();
        ojy.kysyTiedot();
        /*
        Tehtava 3
        Tehtava 4
        */
        Puhelin p = new Puhelin();
        Scanner sc = new Scanner(System.in);
        p.kysyTiedot(sc);
        
        int kaiutinaani = 0;
        int mikrofoniaani = 0;
        while(true) {
            System.out.println("Mikrofonin ääni:");
            mikrofoniaani = Integer.parseInt(sc.nextLine());
            System.out.println("Kaiuttimen ääni:");
            kaiutinaani = Integer.parseInt(sc.nextLine());
            
            if(kaiutinaani <= 0||mikrofoniaani<=0) {
                break;
            }
            p.kysyAani(mikrofoniaani, kaiutinaani);
            p.toimiikoKaikki();
        }
    }
    
}
