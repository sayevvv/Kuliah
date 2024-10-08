package Jobsheet4.Tugas;

public class Pelayan {
    private String nama;
    private int biayaPelayanan;
    private int biayaTambahan; // Biaya untuk layanan tambahan seperti room service

    public Pelayan(){}

    public void setNama(String newValue){
        nama = newValue;
    }
    public void setBiayaPelayanan(int newValue){
        biayaPelayanan = newValue;
    }
    public void setBiayaTambahan(int newValue){
        biayaTambahan = newValue;
    }
    public String getNama(){
        return nama;
    }
    public int getBiayaPelayanan(){
        return biayaPelayanan;
    }
    public int getBiayaTambahan(){
        return biayaTambahan;
    }
    public int hitungBiayaPelayan(int hari){
        return biayaPelayanan * hari + biayaTambahan; // Biaya tambahan ditambahkan sekali saja
    }
    public void info(){
        System.out.println("Nama Pelayan: " + nama);
        System.out.println("Biaya Pelayanan per Hari: " + biayaPelayanan);
        System.out.println("Biaya Tambahan: " + biayaTambahan);
    }
}
