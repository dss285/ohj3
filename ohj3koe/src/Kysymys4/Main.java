/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys4;

import java.util.ArrayList;

/**
 *
 * @author Tommi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Housut> housut = new ArrayList<>();
        housut.add(new Juhlahousut("Villa", "Tähti", 30, "L", "Keltainen"));
        housut.add(new Juhlahousut("Kangas", "Kolmio", 20, "S", "Sininen"));
        housut.add(new Ulkoiluhousut(2000, 1000, 50, "L", "Musta"));
        housut.add(new Ulkoiluhousut(2210, 5000, 52, "L", "Harmaa"));
        for(Housut h : housut) {
            System.out.println(h);
        }
    }
    
}
