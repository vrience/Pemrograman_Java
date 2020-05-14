/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12_juvrience;

/**
 * Nama : Juvrience Marcius Lim
 * NIM  : 50170035
 */
import java.util.Scanner;

public class Kasus1 {

    public static void main(String[] args) {
        int jumlah, i, j, swap;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan : ");
        jumlah = scan.nextInt();

        int array[] = new int[jumlah];

        System.out.println("\nMasukkan " + jumlah + " Buah Bilangan Integer");
        System.out.println("=============================================");

        for (i = 0; i < jumlah; i++) {
            System.out.print("Bilangan Ke-" + (i + 1) + " = ");
            array[i] = scan.nextInt();
        }

        System.out.println("\nBilangan Belum Terurutnya adalah : ");
        for (int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }

        for (i = 0; i < (jumlah - 1); i++) {
            for (j = 0; j < jumlah - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("\n\nBilangan Terurutnya adalah : ");
        for (i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
