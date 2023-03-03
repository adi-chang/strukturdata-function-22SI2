//Stephanie - 22SI2
//NIM : 03081220016

import java.util.Random;

public class Soal_05_1 {
    static int nilaiJenisData(int jenisData, int[]data) {
        int count = 0;
        for (int x : data) {
            if (jenisData == 1) {
                if (x % 2 != 0)
                    count++;
            }
            else if (jenisData == 2) {
                if (x % 2 == 0)
                    count++;
            }
        }
        return count;
    }

    static int[] dapatData(int jenisData, int[] data){
        int[] arr = new int[nilaiJenisData(jenisData, data)];
        int indeks = 0;
        for (int i : data) {
            if (jenisData == 1){
                if (i % 2!= 0)
                    arr[indeks++] = i;
            }
            else if (jenisData == 2) {
                if (i % 2 == 0)
                    arr[indeks++] = i;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 30;
        int[] data = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++)
            data[i] = rnd.nextInt(100) + 1;

        System.out.println("Sumber : ");
        for (int x : data) {
            System.out.print(x + " ");
        }

        int[] ganjil = dapatData(1, data);
        int[] genap = dapatData(2, data);

        System.out.println("\nData Ganjil:");
        for (int x : ganjil) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Data Genap:");
        for (int x : genap) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
