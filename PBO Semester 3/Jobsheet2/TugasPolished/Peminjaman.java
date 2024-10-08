package Jobsheet2.TugasPolished;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Peminjaman {
    private int id;
    private int harga;
    private int qty;
    private int lama_pinjam;
    private int total_harga;
    private String nama;
    private String alamat;
    private String telpon;
    private String tgl_pinjam;
    private String tgl_kembali;
    private DVDGame game;

    // Constructor
    public Peminjaman(int id, String nama, String alamat, String telp, int harga, DVDGame pilihan) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telpon = telp;
        this.harga = harga;
        this.game = pilihan;
    }

    public void pinjamBerapa(){
        Scanner sc = new Scanner(System.in);
        int x;
        do{
            System.out.println("Stok game\t\t: " + game.getStokDvdGame());
            System.out.print("Berapa banyak yang ingin kamu pinjam? : ");
            x = sc.nextInt();
        }while(x > game.getStokDvdGame());
        qty = x;
        game.setStokBerkurang(x);
    }

    // Set peminjaman dates
    public boolean setPeminjaman(String tanggal1, String tanggal2) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Tambahkan tahun default (misalnya tahun ini)
            int currentYear = LocalDate.now().getYear();
            String tanggalPinjamWithYear = tanggal1 + "/" + currentYear;
            String tanggalKembaliWithYear = tanggal2 + "/" + currentYear;

            // Parsing tanggal dengan tahun ditambahkan
            LocalDate pinjamDate = LocalDate.parse(tanggalPinjamWithYear, formatter);
            LocalDate kembaliDate = LocalDate.parse(tanggalKembaliWithYear, formatter);

            // Print hasil parsing tanggal
            System.out.println("Tanggal Pinjam\t: " + pinjamDate);
            System.out.println("Tanggal Kembali\t: " + kembaliDate);

            // Cek apakah tanggal peminjaman lebih besar dari tanggal kembali
            if (pinjamDate.isAfter(kembaliDate)) {
                System.out.println("Tanggal pinjam tidak boleh lebih dari tanggal kembali!");
                return false;
            }

            this.tgl_pinjam = tanggal1;
            this.tgl_kembali = tanggal2;
            System.out.println("Peminjaman berhasil dilakukan dari " + tanggal1 + " hingga " + tanggal2);
            return true;

        } catch (DateTimeParseException e) {
            // Tampilkan pesan error spesifik dari exception
            System.out.println("Format tanggal salah atau parsing gagal: " + e.getMessage());
            return false;
        } catch (Exception e) {
            // Tangkap semua jenis exception lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            return false;
        }
    }

    // Display borrowing details
    public void tampilPeminjaman() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Peminjam: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telpon);
        System.out.println("Tanggal Pinjam: " + tgl_pinjam);
        System.out.println("Tanggal Kembali: " + tgl_kembali);
        System.out.println("DVD Game yang Dipinjam: " + game.getNamaDvdGame());
        System.out.println("Jumlah: " + qty);
        System.out.println("Harga: " + harga);
    }

    // Calculate the borrowing period
    public int hitungLamaPinjam(String tgl_pinjam, String tgl_kembali) {
        // Formatter untuk format tanggal "dd/MM"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Tambahkan tahun default (misalnya tahun ini) agar parsing tanggal lebih akurat
        int currentYear = LocalDate.now().getYear();
        String tanggalPinjamWithYear = tgl_pinjam + "/" + currentYear;
        String tanggalKembaliWithYear = tgl_kembali + "/" + currentYear;

        // Parsing tanggal pinjam dan kembali dengan format "dd/MM/yyyy"
        LocalDate pinjamDate = LocalDate.parse(tanggalPinjamWithYear, formatter);
        LocalDate kembaliDate = LocalDate.parse(tanggalKembaliWithYear, formatter);

        // Hitung lama pinjam dalam hari
        this.lama_pinjam = (int) ChronoUnit.DAYS.between(pinjamDate, kembaliDate);

        // Jika hasil negatif, itu artinya tanggal pinjam lebih dari tanggal kembali
        if (lama_pinjam < 0) {
            System.out.println("Tanggal pinjam tidak boleh lebih dari tanggal kembali!");
            return -1;
        }

        System.out.println("Lama pinjam: " + lama_pinjam + " hari.");
        return lama_pinjam;
    }

    // Calculate total price
    public int totalHarga() {
        this.total_harga = harga * qty * lama_pinjam;
        return total_harga;
    }
    
}
