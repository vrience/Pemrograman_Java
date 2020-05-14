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
public class Kasus3 {

    public static void main(String[] args) {
        int i;
        int[] data = {12, 35, 9, 71, 82, 2};
        urutkan(data, data.length);
        System.out.println();
        System.out.println("Insertion Sorting");
        System.out.println();
        System.out.println("Sebelum Pengurutan Data = ");
        System.out.println("12,35,9,71,82,2");
        System.out.println();
        System.out.println("Hasil Pengurutan Data = ");
        tampilkan(data, data.length);
    }

    private static void tampilkan(int[] tian, int n) {
        for (int i = 0; i < n; i++) 
            System.out.print(tian[i] + " ");
            System.out.println();
    }

    private static void urutkan(int[] tian, int n) {
        int i, k;
        int x;
        boolean ketemu;
        for (k = 1; k < n; k++) {
            x = tian[k];

            i = k-1;
            ketemu = false;
            while ((i >= 0) && (!ketemu)) {
                if (x < tian[i]) {
                    tian[i + 1] = tian[i];
                    i--;
                } else {
                    ketemu = true;
                }
                tian[i + 1] = x;
            }
        }
    }
}