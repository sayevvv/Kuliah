package Jobsheet4.Tugas;

public class Pesanan {
    private Tamu tamu;
    private Kamar kamar;
    private Pelayan pelayan;
    private int malam;

    public Pesanan(){}

    public void setTamu(Tamu newValue){
        tamu = newValue;
    }
    public void setKamar(Kamar newValue){
        kamar = newValue;
    }
    public void setPelayan(Pelayan newValue){
        pelayan = newValue;
    }
    public void setMalam(int newValue){
        malam = newValue;
    }

    public Tamu getTamu(){
        return tamu;
    }
    public Kamar getKamar(){
        return kamar;
    }
    public Pelayan getPelayan(){
        return pelayan;
    }
    public int getMalam(){
        return malam;
    }

    public int hitungBiayaTotal(){
        int biayaKamar = kamar.hitungBiayaKamar(malam);
        int biayaPelayan = pelayan.hitungBiayaPelayan(malam);
        int totalBiaya = biayaKamar + biayaPelayan;

        // Jika tamu adalah member, dapatkan diskon 10%
        if(tamu.isMember()){
            totalBiaya *= 0.9;
        }

        return totalBiaya;
    }
    public void info(){
        System.out.println("Pesanan untuk Tamu: ");
        tamu.info();
        System.out.println("Kamar yang Dipesan: ");
        kamar.info();
        System.out.println("Pelayan yang Melayani: ");
        pelayan.info();
        System.out.println("Jumlah Malam: " + malam);
        System.out.println("Biaya Total: " + hitungBiayaTotal());
    }
}
