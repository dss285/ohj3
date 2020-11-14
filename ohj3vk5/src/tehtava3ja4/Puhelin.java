/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava3ja4;
/**
 * @author Tommi
 * @date Feb 6, 2020
 */
import java.util.Scanner;
public class Puhelin {

    // Variables
    Mikrofoni mikrofoni;
    Kaiutin kaiutin;
    // Constructors
    public Puhelin() {
    }
    // Methods
    public void kysyAani(int mikrofoni, int kaiutin) {
        this.mikrofoni.setVolume(mikrofoni);
        this.kaiutin.setVolume(kaiutin);
        
    }
    public void toimiikoKaikki() {
        if(this.mikrofoni.micOn()&&this.mikrofoni.micOff()) {
            System.out.println("Mikrofoni voidaan mykistää/laittaa päälle");
        } else {
            System.out.println("Mikrofonia ei voitu mykistää/laittaa päälle");
        }
        if(this.kaiutin.mute()&&this.kaiutin.unmute()) {
            System.out.println("Kaiuttimen voi mykistää/laittaa päälle");
        } else {
            System.out.println("Kaiutinta ei voitu mykistää/laittaa päälle");
        }
    }
    public void kysyTiedot(Scanner sc) {
        System.out.println("Minkälaista kaiutinta ? (1=Broadcom Kaiutin/2=Qualcomm Kaiutin)");
        String ln = sc.nextLine();
        if(ln.equals("1")) {
            kaiutin = new BroadcomKaiutin();
        } else if(ln.equals("2")) {
            kaiutin = new QualcommKaiutin();
        }
        
        System.out.println("Minkälaista mikrofonia ? (1=Broadcom Mikrofoni/2=Samsung Mikrofoni)");
        ln = sc.nextLine();
        if(ln.equals("1")) {
            mikrofoni = new BroadcomMikrofoni();
        } else if(ln.equals("2")) {
            mikrofoni = new SamsungMikrofoni();
        }
    }


}
