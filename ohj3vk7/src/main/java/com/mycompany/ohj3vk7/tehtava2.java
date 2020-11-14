package com.mycompany.ohj3vk7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Tommi
 * @date Feb 20, 2020
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
public class tehtava2 {

    // Variables
    private static final ArrayList<Mittaus> lista = new ArrayList<>();
    // Constructors

    // Methods
    public static void main(String[] args) {
        System.out.println("moi");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Haluatko syöttää mittauksen ? ('EXIT' poistaa)");
            String s = sc.nextLine();
            if(s.toUpperCase().equals("EXIT")) {
                break;
            }
            System.out.println("Anna mittauksen paikka");
            String sijainti = sc.nextLine();
            System.out.println("Anna mittauksen lämpötila");
            Double lampo = Double.parseDouble(sc.nextLine());
            System.out.println("Anna mittauksen PH");
            Double ph = Double.parseDouble(sc.nextLine());
            lista.add(new Mittaus(sijainti, lampo, ph));
        }
        Mittaus max = lampoMax();
        double avgph = phAvg();
        double avglampo = lampoAvg();
        
        System.out.println("PH keskiarvo on "+avgph);
        System.out.println("Lämpötilan keskiarvo on "+avglampo);
        System.out.println("Maksimilämpötila on "
                +max.getLampotila()+" paikassa "
                +max.getSijainti()+", ja PH oli silloin "
                +max.getPh());
    }
    public static double phAvg() {
        double summa = 0;
        for(Mittaus m : lista) {
            summa += m.getPh();
        }
        return summa / lista.size();
    }
    public static double lampoAvg() {
        double summa = 0;
        for(Mittaus m : lista) {
            summa += m.getLampotila();
        }
        return summa / lista.size();
    }
    public static Mittaus lampoMax() {
        Mittaus max = null;
        if(lista.size() > 0) {
            max = lista.get(0);
            for(Mittaus m : lista) {
                if(max.getLampotila() < m.getLampotila()) {
                    max = m;
                }
            }
            
        }
        return max;
    }
}
