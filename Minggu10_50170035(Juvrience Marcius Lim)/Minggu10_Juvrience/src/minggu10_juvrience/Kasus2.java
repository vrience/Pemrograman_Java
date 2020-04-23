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
public class Kasus2 {
public static void main(String[] args){
         Scanner input = new Scanner(System.in);
//         Scanner scan = new Scanner(System.in);
         
         int array[], i, mk;
         array = new int[100];
         String nama;
         float rata, nilai, jumlah =0;
   
         System.out.println("--- Mencari rata-rata nilai ---");
         System.out.print("Nama : ");
         nama=input.nextLine();
         System.out.print("Jumlah MK : ");
         mk=input.nextInt();
         
         for(i=1; i<=mk; i++){
            System.out.print("Nilai MK ke : "+ i +" adalah ");
                    array[i]=input.nextInt();
                    jumlah = jumlah + array[i];     
         }
         rata= jumlah/mk;
         System.out.println("Rata-rata " + rata);
     }
}
