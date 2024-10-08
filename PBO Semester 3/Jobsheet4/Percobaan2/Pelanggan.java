package Jobsheet4.Percobaan2;

public class Pelanggan{
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public Pelanggan(){

    }
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setMobil(Mobil newValue){
        mobil = newValue;
    }
    public void setSopir(Sopir newValue){
        sopir = newValue;
    }
    public void setHari(int newValue){
        hari = newValue;
    }

    public String getNama(){
        return nama;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public Sopir geSopir(){
        return sopir;
    }
    public int getHari(){
        return hari;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}