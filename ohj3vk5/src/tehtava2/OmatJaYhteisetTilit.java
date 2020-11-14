/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava2;
/**
 * @author Tommi
 * @date Feb 6, 2020
 */
import tehtava1.Supersaastotili;
import tehtava1.Saastotili;
import java.util.Scanner;
public class OmatJaYhteisetTilit {

    // Variables
    private Saastotili omaTili;
    private Supersaastotili yhteinenTili;

    // Constructors

    public OmatJaYhteisetTilit() {
        omaTili = new Saastotili();
        yhteinenTili = new Supersaastotili();
    }
    // Methods
    public void kysyTiedot() {
        System.out.println("Oma tili:\n");
        omaTili.kysyTiedot();
        System.out.println("Yhteinen tili:\n");
        yhteinenTili.kysyTiedot();
        
        omaTili.tulostaTilintiedot();
        yhteinenTili.tulostaTilintiedot();
    }

}
