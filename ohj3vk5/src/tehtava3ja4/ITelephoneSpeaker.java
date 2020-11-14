/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava3ja4;

/**
 *
 * @author Tommi
 */
public interface ITelephoneSpeaker {
    public boolean mute();
    public boolean unmute();
    public void setVolume(int vol);
    public int getVolume();
}
