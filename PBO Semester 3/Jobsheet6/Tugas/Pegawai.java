package Jobsheet6.Tugas;

public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    public Pegawai(String x, String y, String z){
        nip = x;
        nama = y;
        alamat = z;
    }
    public String getNama() {
        return nama;
    }
    public int getGaji(){
        return 0;
    }
    public String getNip() {
        return nip;
    }
    public String getAlamat() {
        return alamat;
    }
}
