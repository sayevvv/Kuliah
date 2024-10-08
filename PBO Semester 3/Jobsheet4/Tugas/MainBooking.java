package Jobsheet4.Tugas;

public class MainBooking {
    public static void main(String[] args) {
        // Membuat kamar
        Kamar kamar = new Kamar();
        kamar.setTipeKamar("Deluxe");
        kamar.setHarga(500000);

        // Membuat pelayan dengan biaya tambahan untuk layanan tambahan
        Pelayan pelayan = new Pelayan();
        pelayan.setNama("Ahmad");
        pelayan.setBiayaPelayanan(100000);
        pelayan.setBiayaTambahan(50000); // Biaya tambahan untuk layanan ekstra

        // Membuat tamu, member mendapatkan diskon
        Tamu tamu = new Tamu();
        tamu.setNama("Andi");
        tamu.setMember(true); // Tamu ini adalah member

        // Membuat pesanan
        Pesanan pesanan = new Pesanan();
        pesanan.setTamu(tamu);
        pesanan.setKamar(kamar);
        pesanan.setPelayan(pelayan);
        pesanan.setMalam(3);

        // Membuat resepsionis
        Resepsionis resepsionis = new Resepsionis();
        resepsionis.setNama("Dina");
        resepsionis.sambutTamu(tamu.getNama());

        // Output biaya total
        System.out.println("Biaya Total = " + pesanan.hitungBiayaTotal());

        System.out.println("\n=== Informasi Pesanan ===");
        System.out.println("");
        pesanan.info();
    }
}
