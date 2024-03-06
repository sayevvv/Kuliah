package B;

public class mobil {
    public String nama;
    public int cc;
    public int hargaBeli;
    public int thnProduksi;

    public mobil(String n, int c, int h, int t){
        nama = n;
        cc = c;
        hargaBeli = h;
        thnProduksi = t;
    }
    public double hitungPajak(){
        if(cc > 1500){
            return hargaBeli * 0.1;
        }else {
            return hargaBeli * 0.075;
        }
    }
    public double hitungBiayaPerawatan(){
        if(thnProduksi < 2010){
            return hargaBeli * 0.08;
        }else {
            return hargaBeli * 0.05;
        }
    }
    public double hitungBiayaTotal(){
        return hitungPajak() + hitungBiayaPerawatan();
    }
    public void printData(){
        System.out.println("");
        System.out.println("========================");
        System.out.println("MOBIL : " + nama);
        System.out.println("cc : " + cc);
        System.out.println("harga : " + hargaBeli);
        System.out.println("tahun produksi : " +thnProduksi);
        System.out.println("pajak : " + hitungPajak());
        System.out.println("biaya perawatan : " + hitungBiayaPerawatan());
        System.out.println("========================");
        System.out.println("biaya total : Rp." + hitungBiayaTotal());
        System.out.println("========================");
    }
}
