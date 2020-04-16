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
public class Kasus5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jurusan;
        String nama;
        int n1, n2, n3, n4 ,nim, kode;
        double hasil;
        char grade;
        System.out.println("      Universitas Indonesia     ");
        System.out.println("         Fakultas Teknik          ");
        System.out.println("==================================");
        
        System.out.print("Nama Mahasiswa = ");
        nama = input.nextLine();
        
        System.out.print("NIM            = ");
        nim = input.nextInt();
        
        System.out.print("Kode Jurusan   = ");
        kode = input.nextInt();
        
        if(kode == 1){
             System.out.println("Nama Jurusan   = Teknik Mesin");
         }
         else if(kode == 2){
             System.out.println("Nama Jurusan   = Teknik Sipil");
         }
         else if(kode == 3){
             System.out.println("Nama Jurusan   = Teknik Elektro");
         }
         else if(kode == 4){
             System.out.println("Nama Jurusan   = Teknik Industri");
         }
         else
         {
             System.out.println("Kode yang dimasukan salah");
         }

        System.out.print("Nilai Absensi  = ");
        n1 = input.nextInt();

        System.out.print("Nilai Tugas    = ");
        n2 = input.nextInt();

        System.out.print("Nilai UTS      = ");
        n3 = input.nextInt();

        System.out.print("Nilai UAS      = ");
        n4 = input.nextInt();

        System.out.println("------------------------------");
        hasil =(0.2*n1)+(0.25*n2)+(0.25*n3)+(0.3*n4);
        System.out.println("Nilai Khs    = " + hasil );
        
       if(hasil >= 60){
             System.out.println("Keterangan = Lulus");
         }
         else
         {
             System.out.println("Keterangan = Tidak Lulus");
         }
         
    }
}

