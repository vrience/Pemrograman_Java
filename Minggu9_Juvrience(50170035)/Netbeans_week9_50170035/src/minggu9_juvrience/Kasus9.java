/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9_juvrience;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
import java.util.Scanner;

public class Kasus9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int saldo = 100000, simpan, total = 0, ambil, pilih;

        System.out.println("MENU ATM");
        System.out.println("1. Cek Saldo        2. Simpan Uang      3. Ambil Uang");
        System.out.print("Pilih Menu     : ");
        pilih = input.nextInt();

        if (pilih == 1) {
            System.out.println("Saldo saat ini   : Rp. " + saldo);

        } else if (pilih == 2) {
            System.out.print("Simpan Uang      : Rp. ");
            simpan = input.nextInt();
            total = saldo + simpan;
            System.out.println("Saldo saat ini   : Rp. " + total);
        } else if (pilih == 3) {

            System.out.print("Ambil uang       : Rp. ");
            ambil = input.nextInt();
            if (ambil <= saldo) {
                total = saldo - ambil;
                System.out.println("Saldo saat ini   : Rp. " + total);
            } else {
                System.out.println("Saldo anda tidak mencukupi");
            }
        } else {
            System.out.println("Menu tidak tersedia");
        }
    }
}
