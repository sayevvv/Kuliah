package Jobsheet6.Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarif_sks;
    public Dosen(String x, String y, String z){
        super(x, y, z);
    }
    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    public void setTarif_sks(int tarif_sks) {
        this.tarif_sks = tarif_sks;
    }
    public int getJumlahSKS() {
        return jumlahSKS;
    }
    public int getTarif_sks() {
        return tarif_sks;
    }
}
