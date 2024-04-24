package UTS;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tentukan Berapa Kapasitas Stok : ");
        int kp = sc.nextInt();
        
        StokAlgo list = new StokAlgo(kp);

        Stok[] x = new Stok[kp];
        System.out.println("=== MASUKKAN DAN TAMBAHKAN DATA BARANG ===");
        sc.nextLine();

        for(int i = 0; i < x.length; i++){
            System.out.println("Input data ke " + (i+1));
            System.out.print("kode barang : ");
            String k = sc.nextLine();
            System.out.print("nama : ");
            String n = sc.nextLine();
            System.out.print("kategori : ");
            String ka = sc.nextLine();
            System.out.print("harga satuan: ");
            int h = sc.nextInt();
            System.out.print("stok : ");
            int s = sc.nextInt();
            sc.nextLine();
            x[i] = new Stok(k, n, ka, h, s);
            list.tambah(x[i]); 
        }

        System.out.println("=== Tampilkan Semua Data Barang ===");
        list.tampil();

        System.out.println("=== Urutkan Data Barang Berdasarkan Nilai Stok Dalam Mode Menaik");
        list.bubbleSort();
        list.tampil();

        System.out.println("=== Menampilkan Makanan yang tergolong sebagai makanan dan tidak memiliki Stok ===");
        list.TampilDataKetemu("makanan");
        System.out.println("");
        
        System.out.println("=== Mencari Data Barang Berdasarkan Namanya ===");
        System.out.print("Masukkan nama barang yang mau dicari : ");
        String cariNama = sc.nextLine();
        int posisiBinNama = list.FindBinarySearchNama(cariNama, 0, kp-1);
        list.Tampilposisi(cariNama, posisiBinNama);
        System.out.println("");

        list.tampil();
        System.out.println("Data ke berapa yang mau kamu tambahkan barang : ");
        int akunPilihan = sc.nextInt();
        System.out.println("1. TAMBAH STOK || 2. KURANGI STOK || 3. GA NGAPA2IN");
        System.out.print("Pilih : ");
        int pilihan = sc.nextInt();
        switch(pilihan) {
            case 1:
                System.out.println(" === MENAMBAHKAN STOK BARANG " + x[akunPilihan + 1].kodeBarang + " ===" );
                System.out.print("Jumlah stok yang mau ditambah : ");
                int tambah = sc.nextInt();
                x[akunPilihan].tambahStok(tambah);
                break;
            case 2:
                System.out.println(" === MENGURANGI STOK BARANG " + x[akunPilihan + 1].kodeBarang + " ===");
                System.out.println("Jumlah stok yang mau dikurangi : ");
                int kurang = sc.nextInt();
                if(kurang > x[akunPilihan].stok){
                    System.out.println("Kelebihan bolo");
                }else {
                    x[akunPilihan].kurangiStok(kurang);
                }
                break;
            default:
                System.out.println("byebye");
                break;
        }
        list.tampil();
    }
}
