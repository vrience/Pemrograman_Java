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

public class Kasus4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Banyak data : ");
        int N = in.nextInt();
        int data[] = new int[N];
        for (int i = 0;i < N;i++) {
            System.out.print("data ke-" + (i + 1) + " : ");
            data[i] = in.nextInt();
        }

        for (int i = 1;i < data.length;i++) {
            int key = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > key) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = key;
        }

        System.out.println("Data yang telah diurut : ");
        for (int i = 0;i < data.length;i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
