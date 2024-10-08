package Jobsheet4.Percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKtp(String k){
        ktp = k;
    }
    public void setNama(String n){
        nama = n;
    }
    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
