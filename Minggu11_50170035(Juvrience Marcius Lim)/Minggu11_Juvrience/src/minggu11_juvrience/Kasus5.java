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
public class Kasus5 {

    public static void main(String[] args) {

        String[][] data = new String[3][2];
        Scanner scan = new Scanner(System.in);

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("Baris ke-%d Kolom ke-%d = ", r, c);
                data[r][c] = scan.nextLine();
            }
        }
        System.out.println("");
        System.out.println("Output  :");
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("%s \t", data[r][c]);
            }
            System.out.println("");
        }
    }
}
