/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10_juvrience;

import java.util.Scanner;

/**
 * Nama : Juvrience Marcius Lim NIM : 5017035
 */
public class Kasus7 {

    public static void main(String[] args) {

        String[][] data = new String[2][4];
        Scanner scan = new Scanner(System.in);

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("Masukan Data (%d,%d): ", r, c);
                data[r][c] = scan.nextLine();
            }
        }

        System.out.println("");
        System.out.println("            DATA PELANGGAN PT. SENTOSA JAYA             ");
        System.out.println("       JL. Sagu No.27A Kebagusan Jakarta Selatan           ");
        System.out.println("==========================================================");
        System.out.println("No    Kode Pelanggan      Nama Pelanggan      Alamat");
        System.out.println("==========================================================");
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("  %s  \t", data[r][c]);
            }
            System.out.println("");
        }
        System.out.println("==========================================================");
    }
}
