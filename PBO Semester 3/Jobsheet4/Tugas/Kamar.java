package Jobsheet4.Tugas;

public class Kamar {
    private String tipeKamar;
    private int harga;

    public Kamar(){}

    public void setTipeKamar(String newValue){
        tipeKamar = newValue;
    }
    public void setHarga(int newValue){
        harga = newValue;
    }
    public String getTipeKamar(){
        return tipeKamar;
    }
    public int getHarga(){
        return harga;
    }
    public int hitungBiayaKamar(int malam){
        return harga * malam;
    }
    public void info(){
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga Kamar per Malam: " + harga);
    }
}
