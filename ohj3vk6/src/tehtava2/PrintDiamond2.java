/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava2;
/**
 * @author Tommi
 * @date Feb 13, 2020
 */
public class PrintDiamond2 extends Thread {

    // Variables

    // Constructors
    public synchronized void print() {
        System.out.println("");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
        System.out.println("");
    }
    @Override
    public void run() {
        this.print();
    }
}
