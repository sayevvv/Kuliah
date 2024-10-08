package Jobsheet4.Percobaan3;


public class KereteApi{
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KereteApi(String n, String k, Pegawai m){
        nama = n;
        kelas = k;
        masinis = m;
        // asisten = null;
    }
    
    public KereteApi(String n, String k, Pegawai m, Pegawai a){
        nama = n;
        kelas = k;
        masinis = m;
        asisten = a;
    }
    public void setNama(String n){
        nama = n;
    }
    public void setKelas(String k){
        kelas = k;
    }
    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        } else {
            info += "Asisten: Tidak ada\n"; 
        }
        return info;
    }
}