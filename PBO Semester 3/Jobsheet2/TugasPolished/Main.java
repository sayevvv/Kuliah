package Jobsheet2.TugasPolished;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a DVDGame object
        DVDGame dvd1 = new DVDGame("DVD001", "The Witcher", "RPG", 10, 150000);
        dvd1.tampilBarang();

        // Borrow DVDGame
        System.out.println("\n=== Proses Peminjaman ===");
        System.out.print("Masukkan ID Peminjam\t: ");
        int id_peminjam = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Masukkan Nama Peminjam\t: ");
        String nama_peminjam = input.nextLine();

        System.out.print("Masukkan Alamat\t\t: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan No. Telepon\t: ");
        String telpon = input.nextLine();

        
        // Get the price from the DVDGame object
        int harga = dvd1.getHargaDvdGame();
        
        // Create a Peminjaman object
        Peminjaman pinjam1 = new Peminjaman(id_peminjam, nama_peminjam, alamat, telpon, harga, dvd1);
        
        // Inisialisasi
        boolean success = false;
        String tgl_pinjam = "";
        String tgl_kembali = "";

        while (!success) {
            System.out.print("Masukkan Tanggal Pinjam (dd/MM): ");
            tgl_pinjam = input.nextLine();
            System.out.print("Masukkan Tanggal Kembali (dd/MM): ");
            tgl_kembali = input.nextLine();

            success = pinjam1.setPeminjaman(tgl_pinjam, tgl_kembali);
        }
        
        System.out.println("");
        pinjam1.pinjamBerapa();
        
        System.out.println("");
        pinjam1.tampilPeminjaman();

    
        System.out.println("");
        pinjam1.hitungLamaPinjam(tgl_pinjam, tgl_kembali);

        System.out.println("");
        int total = pinjam1.totalHarga();
        System.out.println("Total Harga Peminjaman: " + total);

        System.out.println("Stok game " + dvd1.getNamaDvdGame() + " tersisa " + dvd1.getStokDvdGame());

        input.close();
    }
}
