package UTS;

public class Stok {
    String kodeBarang, nama, kategori;
    int stok, hargaSatuan;

    public Stok(String k, String n, String ka, int h, int s){
        kodeBarang = k;
        nama = n;
        kategori = ka;
        hargaSatuan = h;
        stok = s;
    }
    void tampil(){
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama : " + nama);
        System.out.println("Kategori : " + kategori );
        System.out.println("HargaSatuan :" + hargaSatuan);
        System.out.println("Stok : " + stok);
    }
    
    void tambahStok(int x){
        stok += x;
    }
    void kurangiStok(int y){
        stok -= y;
    }
}
