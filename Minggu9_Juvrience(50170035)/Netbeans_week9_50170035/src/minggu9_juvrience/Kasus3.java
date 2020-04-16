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
public class Kasus3 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int harga, jumlah, subtotal, diskon = 0, total, bayar, kembali;
        double hasil;
        
        System.out.println("                TOKO SERBA ADA         ");
        System.out.println("  Jl. Bantar Gerbang No.23 Bekasi Jawa Barat  ");
        System.out.println("================================================");

        System.out.print("Nama Barang  = ");
        nama = input.nextLine();
        System.out.print("Harga Barang = Rp. ");
        harga = input.nextInt();
        System.out.print("Jumlah Beli  = ");
        jumlah = input.nextInt();
        System.out.println("------------------------------");
        
        subtotal=harga*jumlah;
        System.out.println("Total Belanja    = Rp. "+subtotal);

        if(subtotal > 500000){
           diskon = subtotal*10/100;
           System.out.println("Potongan Harga   = Rp. "+diskon);

         }
        else if (subtotal >= 300000){
           diskon = subtotal*6/100;
           System.out.println("Potongan Harga   = Rp. "+diskon);
        }
        else if (subtotal >= 150000){
           diskon = subtotal*3/100;
           System.out.println("Potongan Harga   = Rp. "+diskon);
        }
        else if (subtotal >= 100000){
           diskon = subtotal*1/100;
           System.out.println("Potongan Harga   = Rp. "+diskon);
        }
        else{
            diskon = 0;
            System.out.println("Potongan Harga  = Rp. " + diskon);
        }
        System.out.println("------------------------------");

        total = subtotal - diskon;
        System.out.println("Total Harga  = Rp. " + total);

        System.out.print("Uang Bayar   = Rp. ");
        bayar = input.nextInt();

        System.out.println("------------------------------");
        kembali = bayar - total;
        System.out.println("Uang Kembali    = " + kembali);
    }
}

