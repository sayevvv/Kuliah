package UAS_ALSD_Shamil.uasPraktek;
//NOMER 1
public class BarangRental {
    private String noTNKB;
    private String namaKendaraan;
    private String jenisKendaraan;
    private int tahun;
    private int biayaSewa;

    // Constructor
    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    // Getters
    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }
    public void display() {
        System.out.println("| Nomor TNKB\t | Nama Kendaraan\t | Jenis\t | Tahun\t | Biaya Sewa Perjam");
        
    }
}
