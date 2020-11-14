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
import java.util.Scanner;
public class OpiskelijaKoe {
    private final int maxviikko=16, maxkoe=20;
    private String Nimi;
    private int koepisteet, viikkotehtavapisteet;
    public OpiskelijaKoe() {
        
    }
    public OpiskelijaKoe(String nimi, int koepisteet, int viikkotehtavapisteet) {
        this.setNimi(nimi);
        this.setKoepisteet(koepisteet);
        this.setViikkotehtavapisteet(viikkotehtavapisteet);
    }
    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    public int getKoepisteet() {
        return koepisteet;
    }

    public void setKoepisteet(int koepisteet) {
        if(koepisteet <= 20) {
            this.koepisteet = koepisteet;
        } else {
            this.koepisteet = 20;
        }
    }

    public int getViikkotehtavapisteet() {
        return viikkotehtavapisteet;
    }

    public void setViikkotehtavapisteet(int viikkotehtavapisteet) {
        if(viikkotehtavapisteet <= 16) {
            this.viikkotehtavapisteet = viikkotehtavapisteet;
        } else {
            this.viikkotehtavapisteet = 16;
        }
    }
    public int arvosana() {
        int tmp = 0;
        if(this.koepisteet < 10) {
            tmp = 0;
        } else if(this.koepisteet < 12) {
            tmp = 1;
        } else if(this.koepisteet < 14) {
            tmp = 2;
        } else if(this.koepisteet < 16) {
            tmp = 3;
        } else if(this.koepisteet < 18) {
            tmp = 4;
        } else {
            tmp = 5;
        }
        
        if(tmp > 0&&((double)this.viikkotehtavapisteet/this.maxviikko)>= 0.75) {
            tmp++;
        }
        return tmp;
        
    }

    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nimi:");
        this.setNimi(sc.nextLine());
        System.out.println("Viikkotehtäväpisteet:");
        this.setViikkotehtavapisteet(Integer.parseInt(sc.nextLine()));
        System.out.println("Koepisteet:");
        this.setKoepisteet(Integer.parseInt(sc.nextLine()));
        
    }
    @Override
    public String toString() {
        return this.getNimi()+
                "\nViikkotehtavapisteet: "+this.getViikkotehtavapisteet()+"/"+this.maxviikko+
                "\nKoepisteet: "+this.koepisteet+"/"+this.maxkoe+
                "\nArvosana: "+this.arvosana();
    }
}
