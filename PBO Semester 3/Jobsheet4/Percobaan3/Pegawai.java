package Jobsheet4.Percobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public void setNIP(String New){
        nip = New;
    }
    public void setNama(String New){
        nama = New;
    }
    public String info() { String info = "";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
    }
}
