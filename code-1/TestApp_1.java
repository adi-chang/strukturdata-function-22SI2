import java.util.Random;

// buatlah sebuah fungsi yang dapat mengembalikan semua bilangan ganjil atau semua bilangan genap 
// dari sekumpulan bilangan yang dijadikan input bagi fungsi bersangkutan, 
// berdasarkan opsi yang dilewatkan ke fungsi yang bersangkutan. (jenis data: 1 = ganjil, 2 = genap)


public class TestApp_1 {

    public static void main(String[] args) {
        int n = 30;
        int[] source = new int[n];
        Random rnd = new Random();
        for (int i = 0 ; i < n ; i++)
            source[i] = rnd.nextInt(100) + 1;
        System.out.println("Data Sumber:");
        for (int x : source) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] arrGanjil = getData(1, source);
        int[] arrGenap = getData(2, source);
        System.out.println("Data Ganjil:");
        for (int x : arrGanjil) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Data Genap:");
        for (int x : arrGenap) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // create fungsi yang dapat menerima data array dan juga dapat mengembalikan data array baru
    static int[] getData(int jenisData, int[] data) {
        int[] arr = new int[countJenisData(jenisData, data)];
        int idx = 0;
        for (int x : data) {
            if (jenisData == 1) {
                if (x % 2 != 0)
                    arr[idx++] = x;
            }
            else if (jenisData == 2) {
                if (x % 2 == 0)
                    arr[idx++] = x;
            }
        }
        return arr;
    }

    static int countJenisData(int jenisData, int...data) {
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

}