/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk3;

/**
 *
 * @author Tommi
 */
import Tehtava1.Osake;
import Tehtava2.MathUtils;
import Tehtava3.OpiskelijaUtils;
import Tehtava3.Opiskelija;
import Tehtava4.LeasingTieto;
import Tehtava4.LeasingUtils;
import java.util.ArrayList;
import java.util.Scanner;
public class Ohj3vk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Tehtävän 1 testaus
        */
        ArrayList<Osake> osakkeet = new ArrayList<>();
        Osake o1 = new Osake("Nokia", 3000);
        Osake o2 = new Osake("Sonera",5000);
        
        osakkeet.add(o1);
        osakkeet.add(o2);
        
        double tuotto = 0;
        int vuodet = 4;
        double prosentti = 3.5;
        for(Osake o : osakkeet) {
            o.TulostaArvo(prosentti, vuodet);
        }
        System.out.println("############");
        /*
        Tehtävän 2 testaus
        */
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(3.5);
        lista.add(500.0);
        lista.add(200.0);
        lista.add(50.0);
        
        System.out.println(MathUtils.LaskeYhteen(lista));
        System.out.println(MathUtils.SuurinLuku(lista));
        System.out.println(MathUtils.Keskiarvo(lista));
        System.out.println("");
        System.out.println("############");
        /*
        
        Tehtävä 3
        */
        
        Opiskelija op = new Opiskelija();
        op.kysyTiedot();
        op = OpiskelijaUtils.TarkistaTiedot(op);
        
        if(op != null) {
            System.out.println(op);
        } else {
            System.out.println("Tiedot olivat virheelliset");
        }
        System.out.println("##################");
        /*
        
        Tehtävä 4
        */
        Scanner sc = new Scanner(System.in);
        LeasingTieto lt = new LeasingTieto();
        lt.kysyTiedot(sc);
        
        System.out.println("Lisätäänkö uusi tieto(k/e)?");
        String lisataanko = sc.nextLine();
        if(lisataanko.equals("e")) {
            System.out.println(lt);
        } else if(lisataanko.equals("k")) {
            LeasingTieto n = LeasingUtils.KopioiTiedot(lt);
            n.kysyMuutTiedot(sc);
            System.out.println(lt);
            System.out.println("----------");
            System.out.println(n);
        }
        
    }
    
}
