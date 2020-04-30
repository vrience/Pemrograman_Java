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
public class Kasus6 {

    public static void main(String[] args) {

        String[][] data = {{"Amerika", "Inggris", "Jepang", "Perancis", "Indonesia", "Iran", "Irak"},
        {"Teheran", "Bekasi", "Jakarta", "Bantar Gebang", "Tokyo"}};

            System.out.println("Ibukota "+ data[0][4]+ " adalah " + data[1][2]);
            System.out.println("Ibukota "+ data[0][2]+ " adalah " + data[1][4]);
            System.out.println("Ibukota "+ data[0][5]+ " adalah " + data[1][0]);
        
    }
}
