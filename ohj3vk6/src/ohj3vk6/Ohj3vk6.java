/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk6;

/**
 *
 * @author Tommi
 */
import tehtava1.PrintDiamond;
import tehtava2.PrintDiamond2;
import tehtava3.FileUtils;
import tehtava4.ViestiSender;
import tehtava4.Viesti;
import java.util.Scanner;
public class Ohj3vk6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Tehtävä 1
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Montako säiettä luodaan ?");
        int monta = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < monta; i++) {
            PrintDiamond d = new PrintDiamond();
            Thread t = new Thread(d);
            t.start();
            
        }
        System.out.println("---------------------");
        /*
            Tehtävä 2
        */
        System.out.println("Montako säiettä luodaan ?");
        monta = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < monta; i++) {
            PrintDiamond2 d2 = new PrintDiamond2();
            d2.start();
        }
        /*
            Tehtävä 3
        */
        System.out.println("Tiedoston nimi:");
        String nimi = sc.nextLine();
        System.out.println("Syöte:");
        String syote = sc.nextLine();
        FileUtils.WriteToFile(nimi, syote);
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch(Exception ex) {
                
            }
            System.out.println(FileUtils.ReadFromFile(nimi));
        });
        t1.start();
        /*
        Tehtava 4
        */
        ViestiSender vs = new ViestiSender();
        Viesti v = new Viesti();
        v.kysyTiedot(sc);
        
        vs.lahetaViesti(v);
    }
    
}
