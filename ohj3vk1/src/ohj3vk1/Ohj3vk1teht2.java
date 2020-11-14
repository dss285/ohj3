/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk1;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
public class Ohj3vk1teht2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna korkeus:");
        int korkeus = Integer.parseInt(sc.nextLine());
        System.out.println("Anna leveys:");
        int leveys = Integer.parseInt(sc.nextLine());
        System.out.println("Täytetty vai ei (kyllä=k, ei=e)");
        String merkki = sc.nextLine();
        boolean taytetty = false;
            if(merkki.length()==1) {
                if(merkki.equals("k")) {
                    taytetty = true;
                } else if(merkki.equals("e")) {
                    taytetty = false;
                }
            }
        for (int i = 0;i<korkeus;i++) {
            for(int j = 0;j<leveys;j++) {
                if(taytetty) {
                    System.out.print("*");
                } else {
                    if(i==0||i==korkeus-1) {
                        System.out.print("*");
                    } else {
                        if(j == 0||j==leveys-1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println("");
        }
    }            
}
