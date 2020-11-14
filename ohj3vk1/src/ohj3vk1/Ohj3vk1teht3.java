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
public class Ohj3vk1teht3 {
    public static void main(String[] args) {
        int i = 1, summa = 0, suurin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä kuukausittaiset tulot");
        while(true) 
        {
            System.out.println("Anna "+i+". kuukauden tulo");
            int tmp = Integer.parseInt(sc.nextLine());
            if(tmp == -1) {
                i--;
                break;
            }
            if(tmp > suurin) {
                suurin = tmp;
            }
            summa += tmp;
            i++;
        }
        System.out.println("Kokonaistulot ovat "+summa+"\n"
                + "Keskiarvoinen kuukausitulo on "+(summa/i)+"\n"
                + "Suurin kuukausikohtainen tulo on "+suurin);
        
    }
}
