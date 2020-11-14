/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymys4;
/**
 * @author Tommi
 * @date Feb 27, 2020
 */
public class Ulkoiluhousut extends Housut {

    // Variables
    private int vedenpitavyys;
    private int hengittavyys;

    // Constructors

    public Ulkoiluhousut(double hinta, String koko, String vari) {
        super(hinta, koko, vari);
    }

    public Ulkoiluhousut(int vedenpitavyys, int hengittavyys, double hinta, String koko, String vari) {
        super(hinta, koko, vari);
        this.setVedenpitavyys(vedenpitavyys);
        this.setHengittavyys(hengittavyys);
    }

    // Methods
    public int getVedenpitavyys() {
        return vedenpitavyys;
    }

    public final void setVedenpitavyys(int vedenpitavyys) {
        if(vedenpitavyys ==2000||vedenpitavyys==4000||vedenpitavyys==6000||vedenpitavyys==8000) {
            this.vedenpitavyys = vedenpitavyys;
        }
    }

    public int getHengittavyys() {
        return hengittavyys;
    }

    public final void setHengittavyys(int hengittavyys) {
        if(hengittavyys <4000&&hengittavyys>0) {
            this.hengittavyys = hengittavyys;
        }
    }
    public String toString() {
        return super.toString()+
                ", Vedenpitävyys: "+ this.vedenpitavyys
                +", Hengittävyys: "+this.hengittavyys;
    }

}
