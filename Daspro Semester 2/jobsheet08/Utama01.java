package jobsheet08;

import java.util.Scanner;
public class Utama01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kapasitas Maksimal Gudang : ");
        int kap = sc.nextInt();
        Gudang01 gudang = new Gudang01(kap);
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Melihat barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = sc.nextInt();

            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    Barang01 barangBaru = new Barang01(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                default:
                    System.out.println("Pilihan tidak valid, Silakan coba lagi.");
            }
        }
    }
}
