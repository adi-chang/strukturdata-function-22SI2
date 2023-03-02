import java.util.Random;

// buatlah sebuah fungsi yang dapat mengembalikan semua bilangan ganjil atau semua bilangan genap 
// dari sekumpulan bilangan yang dijadikan input bagi fungsi bersangkutan, berdasarkan opsi yang dilewatkan ke fungsi yang bersangkutan.
// jenis data: 1 = ganjil, 2 = genap
// fungsi tersebut harus bisa mengembalikan beberapa informasi, yaitu:
// -	flag : boolean
// status apakah dalam kumpulan data terkandung jenis data yang sedang dicari
// -	data : int[]
//  kumpulan data sesuai dengan jenis data yang sedang dicari
// -	count : int
// banyak data dari jenis data yang sedang dicari

public class TestApp_2 {
    
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
        // get data-data ganjil
        Output objGanjil = getData(1, source);
        // print informasi dari data-data ganjil tsb
        objGanjil.printInfo();
        // get data-data genap
        Output objGenap = getData(2, source);
        // print informasi dari data-data genap tsb
        objGenap.printInfo();
    }

    static Output getData(int jenisData, int...data) {
        int count = countJenisData(jenisData, data);
        int[] arr = new int[count];
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
        Output obj = new Output(count > 0, count, arr);
        return obj;
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

class Output {
    private boolean flag;
    private int[] data;
    private int count;
    public Output(boolean flag, int count, int...data) {
        this.flag = flag;
        this.count = count;
        this.data = data;
    }
    public void printInfo() {
        if (flag) {
            System.out.println("Data:");
            for (int x : data) {
                System.out.print(x + " ");
            }
            System.out.println(String.format("\nCount: %d", count));
        }
        else {
            System.out.println("Sorry, data tidak ditemukan ...");
        }
    }
}
