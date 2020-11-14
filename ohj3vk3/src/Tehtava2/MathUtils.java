/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtava2;

/**
 *
 * @author Tommi
 */
import java.util.ArrayList;
public class MathUtils {
    public static double LaskeYhteen(ArrayList<Double> lista) {
        double sum = 0;
        for(double d : lista) {
            sum+=d;
        }
        return sum;
    }
    public static double SuurinLuku(ArrayList<Double> lista) {
        double suurin = 0;
        for(double d : lista) {
            if(suurin < d) {
                suurin = d;
            }
        }
        return suurin;
    }
    public static double Keskiarvo(ArrayList<Double> lista) {
        return LaskeYhteen(lista)/lista.size();
    }
}
