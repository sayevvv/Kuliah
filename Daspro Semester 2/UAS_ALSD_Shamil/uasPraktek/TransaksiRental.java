package UAS_ALSD_Shamil.uasPraktek;
//NOMER 1
public class TransaksiRental {
    int counter = 1; 
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental barangRental; // BarangRental berelasi dengan TransaksiRental pada totalBiaya (Nomer 1)

    
    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental barangRental) {
        this.kodeTransaksi = counter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barangRental = barangRental;
        this.totalBiaya = lamaPinjam * barangRental.getBiayaSewa(); // Disini (Nomer 1)
    }

    
    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental getBarangRental() {
        return barangRental;
    }
}
