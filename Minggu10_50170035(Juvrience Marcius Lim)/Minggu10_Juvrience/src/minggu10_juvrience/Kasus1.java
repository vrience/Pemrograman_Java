/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu10_juvrience;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim
 * NIM  : 5017035
 */
public class Kasus1 {
public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         int angka=0, faktor = 1;
   
         System.out.println("--- Mencari Faktorial dari Angka ---");
         System.out.print("Masukan Angka : ");
         angka=input.nextInt();
         
         for(int i=1; i<=angka; i++){
            faktor=i*faktor;
         }
        
         System.out.println("Faktorial dari " + angka + " adalah " + faktor);
     }
}
