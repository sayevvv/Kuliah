package Jobsheet4.Percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil(){

    }
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setBiaya(int newValue){
        biaya = newValue;
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
