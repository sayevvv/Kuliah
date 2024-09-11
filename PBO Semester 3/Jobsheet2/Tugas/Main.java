package Jobsheet2.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Membuat objek DVDGame
        DVDGame dvd1 = new DVDGame("DVD001", "The Witcher", "RPG", 10, 150000);
        dvd1.tampilBarang();

        // Meminjam DVDGame
        System.out.println("\n=== Proses Peminjaman ===");
        System.out.print("Masukkan ID Peminjam: ");
        int id_peminjam = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Masukkan Nama Peminjam: ");
        String nama_peminjam = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan No. Telepon: ");
        String telpon = input.nextLine();

        System.out.print("Masukkan Jumlah DVD yang Dipinjam: ");
        int qty = input.nextInt();
        input.nextLine();

        // Ambil harga dari objek DVDGame
        int harga = dvd1.harga_DVDGame;

        // Membuat objek Peminjaman dengan DVDGame
        Peminjaman pinjam1 = new Peminjaman(id_peminjam, nama_peminjam, alamat, telpon, qty, harga, dvd1);


        // Set tanggal peminjaman
        System.out.print("Masukkan Tanggal Pinjam (dd/MM): ");
        String tgl_pinjam = input.nextLine();
        System.out.print("Masukkan Tanggal Kembali (dd/MM): ");
        String tgl_kembali = input.nextLine();
        pinjam1.setPeminjaman(tgl_pinjam, tgl_kembali);

        // Menampilkan detail peminjaman
        pinjam1.tampilPeminjaman();

        // Menghitung lama pinjam
        pinjam1.hitungLamaPinjam(tgl_pinjam, tgl_kembali);

        // Menghitung total harga
        int total = pinjam1.totalHarga();
        System.out.println("Total Harga Peminjaman: " + total);

        input.close();
    }
}
