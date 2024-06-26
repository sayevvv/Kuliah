package jobsheet06.hotel;

public class Hotel {
    public String nama, kota;
    public int harga;
    public byte bintang;

    public Hotel(String n, String k, int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil(){
        System.out.println("Nama Hotel = " + nama);
        System.out.println("Letak Kota Hotel = " + kota);
        System.out.println("Harga Hotel = " + harga);
        System.out.println("Bintang Hotel = " + bintang);
    }
}
