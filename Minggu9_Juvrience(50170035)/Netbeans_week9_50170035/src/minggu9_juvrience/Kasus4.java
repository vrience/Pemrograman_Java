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
public class Kasus4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int n1, n2, n3, n4;
        double hasil;
        char grade;
        System.out.println("      Kwik Kian Gie Institute     ");
        System.out.println("        Nilai Akhir Semester          ");
        System.out.println("=====================================");
        System.out.print("Nama Mahasiswa = ");
        nama = input.nextLine();

        System.out.print("Nilai Absensi  = ");
        n1 = input.nextInt();

        System.out.print("Nilai Tugas    = ");
        n2 = input.nextInt();

        System.out.print("Nilai UTS    = ");
        n3 = input.nextInt();

        System.out.print("Nilai UAS    = ");
        n4 = input.nextInt();

        System.out.println("------------------------------");
        hasil =(0.2*n1)+(0.25*n2)+(0.25*n3)+(0.3*n4);
        System.out.println("Nilai Khs    = " + hasil );
        
       if(hasil >= 80){
             grade='A';
         }
         else if(hasil >= 66){
             grade='B';
         }
         else if(hasil >= 56){
             grade='C';
         }
         else if(hasil >= 46){
             grade='D';
         }
         else
         {
             grade='E';
         }
         System.out.println("Nilai= " + grade);
    }
}
