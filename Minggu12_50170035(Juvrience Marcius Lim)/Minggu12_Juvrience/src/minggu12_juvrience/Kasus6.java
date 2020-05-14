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
public class Kasus6 {

    public static void main(String[] args) {

        int[] tabInt = {51, 23, 17, 32, 43, 88};
        int i, j, N;
        N = 6;
        for (i = 0; i < N; i++) {
            int min = tabInt[i];
            int pos = 1;
            for (j = i; j < N; j++) {

                if (tabInt[j] < min) {
                    min = tabInt[j];
                    pos = j;
                }
            }
            if (i != pos) {
                int temp = tabInt[1];
                tabInt[1] = tabInt[pos];
                tabInt[pos] = temp;
            }
        }
        for (i = 0; i < 6; i++) {
            System.out.print(tabInt[i] + " ");
        }
    }
}
