/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9_juvrience;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
public class kasus11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tahun, pilih, bulan;

        System.out.print("Masukan Tahun    = ");
        tahun = input.nextInt();

        System.out.print("Masukan Bulan    = ");
        bulan = input.nextInt();

        switch (bulan) {
            case 1:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 2:
                if (tahun % 400 == 0) {
                    System.out.println("Jumlah Hari = 29 hari");
                } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                    System.out.println("Jumlah Hari = 28hari");
                } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                    System.out.println("Jumlah Hari = 29hari");
                } else {
                    System.out.println("Jumlah Hari = 28hari");
                }
                break;
            case 3:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 4:
                System.out.println("Jumlah Hari = 30 hari");
                break;
            case 5:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 6:
                System.out.println("Jumlah Hari = 30 hari");
                break;
            case 7:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 8:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 9:
                System.out.println("Jumlah Hari = 30 hari");
                break;
            case 10:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            case 11:
                System.out.println("Jumlah Hari = 30 hari");
                break;
            case 12:
                System.out.println("Jumlah Hari = 31 hari");
                break;
            default:
                System.out.println("Input Salah!");
                break;
        }
    }
}
