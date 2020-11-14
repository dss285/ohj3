/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava4;
/**
 * @author Tommi
 * @date Feb 13, 2020
 */
import java.util.ArrayList;
public class ViestiSender implements IViestiSender {
    // Variables
    private ArrayList<Viesti> viestit = new ArrayList<>();
    Thread t1;
    // Constructors

    public ViestiSender() {
        t1 = new Thread(() -> {
            tulostaViesti();
        });
        t1.start();
    }

    // Methods
    @Override
    public synchronized void lahetaViesti(Viesti v) {
       this.viestit.add(v);
       notifyAll();
    }
    private synchronized void tulostaViesti() {
        while(this.viestit.isEmpty()) {
            try {
                wait();
            } catch(Exception ex) {
                
            }
        }
        Viesti v = viestit.remove(0);
        notifyAll();
        System.out.println(v);
    }
}
