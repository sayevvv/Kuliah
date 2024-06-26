package jobsheet02;

public class Buku01 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double totalDiskon;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Harga total : Rp" + hargaTotal);
        System.out.println("Diskon : " + hitungDiskon());
    }

    void terjual(int jml) {
        if(stok > 0 && stok >=jml) {
            stok -= jml;
            hargaTotal = hitungHargaTotal(jml);
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    public Buku01() {

    }
    public Buku01(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int jml){
        return harga*jml;
    }

    double hitungDiskon() {
        if(hargaTotal > 150000) {
           return 0.12;
        }else if(hargaTotal >= 75000) {
            return 0.5;
        }else {
            return 1;
        }
    }
    double hitungHargaBayar(){
        return hargaTotal * hitungDiskon();
    }
    
}
