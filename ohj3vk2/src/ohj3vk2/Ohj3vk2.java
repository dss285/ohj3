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
public class Ohj3vk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Osoite o = new Osoite("katu", "kuopio", "70121");
        Osoite o2 = new Osoite("katu", "asdassa", "70121");
        Opiskelija a = new Opiskelija("1","1",o,"1");
        Opiskelija b = new Opiskelija("2","2",o,"2");
        Opiskelija c = new Opiskelija("3","3",o2,"3");
        Opiskelija d = new Opiskelija("4","4",o,"4");
        Opiskelija e = new Opiskelija("5","5",o2,"5");
        
        Opiskelijat op = new Opiskelijat();
        op.lisaaOpiskelija(a);
        op.lisaaOpiskelija(b);
        op.lisaaOpiskelija(c);
        op.lisaaOpiskelija(d);
        op.lisaaOpiskelija(e);
        
        op.tulostaAsukkaat("kuopio");
        System.out.println("#########");
        op.poistaOpiskelija(a);
        op.tulostaAsukkaat("kuopio");
    }
    
}
