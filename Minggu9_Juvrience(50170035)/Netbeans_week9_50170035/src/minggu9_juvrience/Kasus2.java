/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu9_juvrience;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim
 * NIM  : 50170035
 */
public class Kasus2 {
   public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         int pendapatan, jasa,komisi,total;
         char grade;
   
         System.out.print("Masukan Pendapatan Sales : Rp. ");
         pendapatan=input.nextInt();
         System.out.println("");
         
         if(pendapatan == 200000){
             jasa=10000;
             komisi=(10*pendapatan)/100;
             System.out.println("Uang Jasa   Rp. " + jasa);
             System.out.println("Uang Komisi Rp. " + komisi);
             System.out.println("============================");
             total = jasa + komisi;
             System.out.println("Uang total Rp. " + total);
         }
         else if(pendapatan >= 200000){
             jasa=20000;
             komisi=(15*pendapatan)/100;
             System.out.println("Uang Jasa   Rp. " + jasa);
             System.out.println("Uang Komisi Rp. " + komisi);
             System.out.println("============================");
             total = jasa + komisi;
             System.out.println("Uang total Rp. " + total);
         }
         else if(pendapatan >= 500000){
             jasa=30000;
             komisi=(20*pendapatan)/100;
             System.out.println("Uang Jasa   Rp. " + jasa);
             System.out.println("Uang Komisi Rp. " + komisi);
             System.out.println("============================");
             total = jasa + komisi;
             System.out.println("Uang total Rp. " + total);
         }
         else
         {
              System.out.println("Pendapatan Sales kurang dari Rp. 200000");
         }
        
     }
}

