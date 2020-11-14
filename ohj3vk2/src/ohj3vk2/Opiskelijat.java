/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk2;

/**
 *
 * @author Tommi
 */
import java.util.ArrayList;
public class Opiskelijat {
    private ArrayList<Opiskelija> lista = new ArrayList<>();
    public void lisaaOpiskelija(Opiskelija o) {
        lista.add(o);
    }
    public void poistaOpiskelija(Opiskelija o) {
        lista.remove(o);
    }
    public void tulostaAsukkaat(String kaupunki) {
        for(Opiskelija o : lista) {
            if(o.getOsoite().getPostitoimipaikka().equals(kaupunki)) {
                System.out.println(o);
            }
        }
    }
}
