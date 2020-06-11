/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Juvrience_PemesananDanPembayaranHotel;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
public class Hotel {

   public void cetakHotel(){
        Scanner input = new Scanner(System.in);

        String nama;
        int total, jumlahMalam, tipe, tax, tagihan, bayar, kembalian;
        double hasil;
        System.out.println("           Hotel Juvrience          ");
        System.out.println("    Pemesanan dan Pembayaran Hotel  ");
        System.out.println("=====================================");
        System.out.println("");
        System.out.println("           Pemesanan Hotel        ");
        System.out.print("Nama Pelanggan = ");
        nama = input.nextLine();

        System.out.println("Tipe Kamar :");
        System.out.println("1. Queen Size - Rp.250000/malam");
        System.out.println("2. King Size  - Rp.320000/malam");
        System.out.print("Pilih Tipe Kamar (1/2)  = ");
        tipe = input.nextInt();

        System.out.print("Lama Menginap/Malam = ");
        jumlahMalam = input.nextInt();

        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("           Pembayaran Hotel        ");
        if (tipe == 1) {
            tipe = 250000;

        } else {
            tipe = 320000;
        }

        total = jumlahMalam * tipe;
        System.out.println("Total Pembayaran        = Rp. " + total);

        tax = total * 10 / 100;
        System.out.println("Tax + Customer Service  = Rp. " + tax);

        System.out.println("----------------------------------------");
        tagihan = tax + total;
        System.out.println("Total Pembayaran        = Rp. " + tagihan);

        System.out.print("Jumlah Pembayaran       = Rp. ");
        bayar = input.nextInt();

        kembalian = bayar - tagihan;
        System.out.println("Total Kembalian         = Rp. " + kembalian);
        System.out.println("");
        System.out.println("Terima kasih " + nama + " atas kunjungan anda di Hotel Juju");

    }
}
