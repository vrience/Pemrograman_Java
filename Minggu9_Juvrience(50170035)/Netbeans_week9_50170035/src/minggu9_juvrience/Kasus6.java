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
public class Kasus6 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int bersih, gapok = 0, kode, tahun, lama, bonus;
        double hasil;
        System.out.println("          PT. Angin Ribut  ");
        System.out.println("  Jl. Sulawesi No.29 Jakarta Utara  ");
        System.out.println("-------------------------------------");

        System.out.print("Nama Karyawan              = ");
        nama = input.nextLine();
        System.out.print("Golongan Karyawan[1,2,3,4] = ");
        kode = input.nextInt();
        
        if(kode == 1){
             gapok=1500000;
         }
         else if(kode == 2){
             gapok=1200000;
         }
         else if(kode == 3){
             gapok=1000000;
         }
         else if(kode == 4){
             gapok=700000;
         }
         else
         {
             System.out.println("Kode yang dimasukan salah");
         }
        System.out.print("Tahun Kerja Karyawan       = ");
        tahun = input.nextInt();
        
        lama= 2017- tahun;
         if(lama >= 5){
             bonus=800000;
         }
         else{
             bonus=0;
         }
        System.out.println("Golongan Karyawan          = " + kode);
        System.out.println("Gaji Pokok Karyawan        = " + gapok);

        System.out.println("Tahun Masuk Kerja          = " + tahun);
        System.out.println("Masa Kerja Karyawan        = " + lama);
        System.out.println("Bonus Karyawan             = " + bonus);

        bersih = gapok + bonus;
        System.out.println("Gaji Karyawan              = " + bersih);
    }
}
