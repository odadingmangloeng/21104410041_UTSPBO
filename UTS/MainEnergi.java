/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author dx
 */
public class MainEnergi {
    
   public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Kecepatan : ");
       double kecepatan = input.nextDouble();
       System.out.print("Masukkan massa : ");
       double masa = input.nextDouble();
      
        System.out.println("Hasil : " +1/2*masa*kecepatan);
    }
    
}
