package Jobsheet4.TugasFixed;

public class Pelayan extends Orang {
    private int biayaPelayanan;
    private int biayaTambahan;

    public Pelayan() {}

    public void setBiayaPelayanan(int newValue) {
        biayaPelayanan = newValue;
    }

    public void setBiayaTambahan(int newValue) {
        biayaTambahan = newValue;
    }

    public int getBiayaPelayanan() {
        return biayaPelayanan;
    }

    public int getBiayaTambahan() {
        return biayaTambahan;
    }

    public int hitungBiayaPelayan(int hari) {
        return biayaPelayanan * hari + biayaTambahan;
    }

    // Override method info untuk menampilkan informasi tambahan
    @Override
    public void info() {
        super.info();  // Memanggil method info() dari Orang
        System.out.println("Biaya Pelayanan per Hari: " + biayaPelayanan);
        System.out.println("Biaya Tambahan: " + biayaTambahan);
    }
}
