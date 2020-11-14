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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ohj3vk1teht4 {
    public static void main(String[] args) {
        ArrayList<Integer> rivi1, rivi2, saadut = new ArrayList<>();
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        rivi1 = arvoRivi(rnd);
        System.out.println("Lottorivi on "+String.join(", ", muuta(rivi1)));
        while(true) {
            System.out.println("Haluatko arpoa rivin ?");
            String s = sc.nextLine();
            if(s.contentEquals("k")) {
                rivi2 = arvoRivi(rnd);
                System.out.println("Ohjelman arpoma rivi on: "+String.join(", ", muuta(rivi2)));
                for(int i : rivi2) {
                    if(rivi1.contains(i)) {
                        saadut.add(i);
                    }
                }
                String saadutstr = String.join(", ", muuta(saadut));
                System.out.println("Oikein oli "+ saadut.size() +", jotka olivat "+saadutstr);
                saadut.clear();
            } else if(s.contentEquals("e")) {
                System.out.println("Kiitos ja hei hei!");
                break;
            }
        }
    }
    public static ArrayList<Integer> arvoRivi(Random rnd) {
        
        final int size = 7, max = 40;
        ArrayList<Integer> rivi = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int tmp = rnd.nextInt(max)+1;
            if(rivi.contains(tmp)) {
                while(true) {
                    tmp = rnd.nextInt(max)+1;
                    if(rivi.contains(tmp)) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            rivi.add(tmp);
        }
        return rivi;
    }
    public static ArrayList<String> muuta(ArrayList<Integer>lst) {
        ArrayList<String> tmp = new ArrayList<>();
        for(int i: lst) {
            tmp.add(Integer.toString(i));
        }
        return tmp;
    }
}
