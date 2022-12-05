/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author dx
 */
public class Kinetic {
    
    private double masa;
    private double kecepatan;
    private double hasil;

    public double getHasil(double hasil) {
        hasil = masa*kecepatan/2;
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public double getMasa() {
        return 0;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getKecepatan() {
        return 0 ;}
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    

    
}
