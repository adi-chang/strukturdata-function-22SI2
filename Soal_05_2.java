//Stephanie - 22SI2
//NIM : 03081220016

import java.util.Random;

class Hasil {
    private boolean flag;
    private int[] data;
    private int jumlah;
    public Hasil(boolean flag, int jumlah, int[]data) {
        this.flag = flag;
        this.jumlah = jumlah;
        this.data = data;
    }
    public void tampilInfo() {
        if (flag) {
            System.out.println("\nData   :");
            for (int x : data) {
                System.out.print(x + " ");
            }
            System.out.println("\nJumlah : " + jumlah);
        }
        else {
            System.out.println("Sorry, data tidak ada");
        }
    }
}

public class Soal_05_2 {

    //Di set valuenya, dimana 1 = ganjil, 2 = genap
    static int nilaiJenisData(int jenisData, int[]data) {
        int jumlah = 0;
        for (int i : data) {
            if (jenisData == 1) {
                if (i % 2 != 0)
                    jumlah++;
            }
            else if (jenisData == 2) {
                if (i % 2 == 0)
                    jumlah++;
            }
        }
        return jumlah;
    }

    static Hasil dapatData(int jenisData, int[] data){
        int jumlah = nilaiJenisData(jenisData, data);
        int[] arr = new int[jumlah];
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
        //Tampilkan data dari arr, jika jumlah <= 0 berarti data tidak ada atau kosong
        Hasil obj = new Hasil(jumlah > 0, jumlah, arr);
        return obj;
    }
    
    public static void main(String[] args) {
        int n = 30;
        int[] sumber = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++)
            sumber[i] = rnd.nextInt(100) + 1;

        System.out.println("Sumber : ");
        for (int x : sumber) {
            System.out.print(x + " ");
        }

        System.out.println();
        Hasil ganjil = dapatData(1, sumber);
        ganjil.tampilInfo();
        
        Hasil genap = dapatData(2, sumber);
        genap.tampilInfo();
    }
}