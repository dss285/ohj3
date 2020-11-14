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
public class SamsungMikrofoni extends Mikrofoni {

    // Constructors
    public SamsungMikrofoni() {
        super();
    }
    // Methods

    @Override
    public boolean micOn() {
        if(super.getVolume() <= 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean micOff() {
        return true;
    }




}
