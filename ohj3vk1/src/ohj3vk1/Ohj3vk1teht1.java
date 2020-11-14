/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohj3vk1;

/**
 *
 * @author Tommi
 */
import java.util.Scanner;
public class Ohj3vk1teht1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Osakkeen nimi:");
        String osake = sc.nextLine();
        System.out.println("Osakkeen osinkoprs:");
        double osinko = Double.parseDouble(sc.nextLine());
        System.out.println("Anna sijoitus");
        int sijoitus = Integer.parseInt(sc.nextLine());
        
        System.out.printf("Osakkeen "+osake+" tuotto pääomalle "+sijoitus+" on %.2f",(osinko/100)*sijoitus);
    }
    
}
