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
public class Kasus1 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         int nilai;
         char grade;
   
         System.out.print("Masukan Nilai : ");
         nilai=input.nextInt();
         
         if(nilai >= 90){
             grade='A';
         }
         else if(nilai >= 80){
             grade='B';
         }
         else if(nilai >= 70){
             grade='C';
         }
         else
         {
             grade='D';
         }
         System.out.println("Nilai= " + grade);
     }
}
