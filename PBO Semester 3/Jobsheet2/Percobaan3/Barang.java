package Jobsheet2.Percobaan3;

public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;

    public void tampilBarang(){
        System.out.println("Nama Barang\t: " + namaBrg);
        System.out.println("Jenis Barang\t: " + jenisBrg);
        System.out.println("Stok\t\t: " + stok);
    }

    public int tambahStok(int brgMasuk) {
        return brgMasuk + stok;
    }
}
