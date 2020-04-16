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
public class Kasus7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jurusan = null;
        int nim, pilih;
        double hasil;

        System.out.print("Masukan Nama     = ");
        nama = input.nextLine();
        
        System.out.print("Masukan NIM      = ");
        nim = input.nextInt();
        
        System.out.println("Pilihan : ");
        System.out.println("1. Sistem Informasi");
        System.out.println("2. Teknik Industri");
        System.out.println("3. Teknik Informatika");
        
        System.out.print("Masukan Pilihan : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1: jurusan=("Sistem Informasi");
            break;
            case 2: jurusan=("Teknik Industri");
            break;
            case 3: jurusan=("Teknik Informatika");
            break;
            default:
                System.out.println("Not Found!");
        }
        System.out.println(nama+" dengan NIM " +nim+" memilih jurusan "+jurusan);
    }
}
