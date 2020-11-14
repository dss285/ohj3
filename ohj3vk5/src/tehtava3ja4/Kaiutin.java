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
public abstract class Kaiutin implements ITelephoneSpeaker {

    // Variables
    private int Volume;
    // Constructors
    
    public Kaiutin() {
    }
    // Methods
    @Override
    public final void setVolume(int vol) {
        this.Volume = vol;
    }
    @Override
    public final int getVolume() {
        return this.Volume;
    }




}
