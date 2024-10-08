package Jobsheet4.Percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir(){}
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setBiaya(int newValue){
        biaya = newValue;
    }
    public String getNama(){
        return nama;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
