package tugas_01;

import java.util.Random;

public class Tugas_01 {
    static int nilaiJenisData(JenisBilangan jenisData, int[]data) {
        int count = 0;
        for (int x : data) {
            if (jenisData == JenisBilangan.Ganjil) {
                if (x % 2 != 0)
                    count++;
            }
            else if (jenisData == JenisBilangan.Genap) {
                if (x % 2 == 0)
                    count++;
            }
        }
        return count;
    }

    static int[] dapatData(JenisBilangan jenisData, int[] data){
        int[] arr = new int[nilaiJenisData(jenisData, data)];
        int indeks = 0;
        for (int i : data) {
            if (jenisData == JenisBilangan.Ganjil){
                if (i % 2!= 0)
                    arr[indeks++] = i;
            }
            else if (jenisData == JenisBilangan.Genap) {
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
        int[] ganjil = dapatData(JenisBilangan.Ganjil, data);
        int[] genap = dapatData(JenisBilangan.Genap, data);

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

enum JenisBilangan {
    Ganjil,
    Genap;
}
