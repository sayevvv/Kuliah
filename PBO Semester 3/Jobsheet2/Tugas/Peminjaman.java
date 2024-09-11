package Jobsheet2.Tugas;

public class Peminjaman {
    int id, harga, qty, lama_pinjam, total_harga;
    String nama, alamat, telpon, tgl_pinjam, tgl_kembali;
    DVDGame game;

    public Peminjaman(int id, String nama, String alamat, String telp, int qty, int harga, DVDGame pilihan) {
    this.id = id;
    this.nama = nama;
    this.alamat = alamat;
    this.telpon = telp;
    this.qty = qty;
    this.harga = harga;
    game = pilihan; 
}
    public void setPeminjaman(String tanggal1, String tanggal2) {
    
        // Ensure both dates have valid format (at least 6 characters, assuming "dd-MM-yyyy" format)
        if (tanggal1.length() < 6 || tanggal2.length() < 6) {
            System.out.println("Format tanggal salah, masukkan format yang benar (dd-MM-yyyy)!");
            return;
        }
    
        // Extract the month and year from the date strings
        String check1 = tanggal1.substring(3, 7); // Assuming format "dd-MM-yyyy"
        String check2 = tanggal2.substring(3, 7); 
    
        // Compare the months and years
        if (check1.equals(check2)) {
            tgl_pinjam = tanggal1;
            tgl_kembali = tanggal2;
            System.out.println("Peminjaman berhasil dilakukan dari " + tanggal1 + " hingga " + tanggal2);
        } else {
            System.out.println("Salah, pastikan kedua tanggal berada dalam bulan yang sama!");
        }
    }
    
    public void tampilPeminjaman(){
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
    public int hitungLamaPinjam(String tgl_pinjam, String tgl_kembali){
        String tgl_pinjam_ambil = tgl_pinjam.substring(0, 2);
        int num1 = Integer.parseInt(tgl_pinjam_ambil);

        String tgl_kembali_ambil = tgl_kembali.substring(0, 2);
        int num2 = Integer.parseInt(tgl_kembali_ambil);
        lama_pinjam = num2 - num1;
        System.out.println("Lama pinjam dalam satu bulan : " + lama_pinjam);
        return lama_pinjam;
    }
    public int totalHarga(){
        total_harga = harga * qty * lama_pinjam; 
        return total_harga;
    }
}
