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
public class Kasus8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jurusan = null;
        int lebar, pilih, panjang;
        double luas, keliling;

        System.out.println("== Menghitung Luas dan Keliling Persegi Panjang==");
        System.out.print("Masukan Panjang     = ");
        panjang = input.nextInt();
        
        System.out.print("Masukan Lebar       = ");
        lebar = input.nextInt();
        
        System.out.println("Pilihan : ");
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        
        System.out.print("Masukan Pilihan : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1: luas = panjang*lebar;
                    System.out.println("Luas Persegi Panjang : " + luas);
            break;
            case 2: keliling = 2*(panjang+lebar);
                    System.out.println("Luas Persegi Panjang : "+ keliling);
            break;
            default:
                System.out.println("Not Found!");
        }
    }
}
