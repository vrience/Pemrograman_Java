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
public class Kasus2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[6];
        System.out.println("Data yang Diinput Ke Elemen Array ");
        System.out.println("");
        

        for (int i = 0; i<data.length; i++) {
            System.out.print("Nilai Akhir Index "+ i + " = ");
            data[i] = input.nextLine();;
        }

    }
}

