/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11_juvrience;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
public class Kasus8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[][], i, n ;
        String[][] mhs = new String[2][5];

        System.out.println("BIODATA MAHASISWA");
        System.out.println("+============INPUTAN=============+");
        System.out.print("Masukkan banyak data = ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("------Data ke-" + i + "-----");
            for (int r = 0; r < mhs.length; r++) {
                System.out.print("Masukkan Nomor      = ");
                mhs[r][0] = input.nextLine();
                System.out.print("Masukkan Nim      = ");
                mhs[r][1] = input.nextLine();
                System.out.print("Masukkan Nama     = ");
                mhs[r][2] = input.nextLine();
                System.out.print("Masukkan Jurusan  = ");
                mhs[r][3] = input.nextLine();
                System.out.print("Masukkan Alamat   = ");
                mhs[r][4] = input.nextLine();
            }
        }
        System.out.println("");
        System.out.println("+============HASIL OUTPUT=============+");
        System.out.println("  No      NIM         Nama Mahasiswa          Jurusan         Alamat");
        System.out.println("==========================================================");
        for (int r = 0; r < mhs.length; r++) {
            for (int c = 0; c < mhs[r].length; c++) {
                System.out.format("   %s  \t", mhs[r][c]);
            }
            System.out.println("");
        }
    }
}


