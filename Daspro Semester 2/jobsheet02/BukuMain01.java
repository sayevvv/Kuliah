package jobsheet02;

public class BukuMain01 {
    public static void main(String[] args) {
        Buku01 bk1 = new Buku01();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.hitungDiskon();
        bk1.terjual(5);
        bk1.hitungDiskon();
        bk1.tampilInformasi();

        // bk1.gantiHarga(60000);
        // bk1.tampilInformasi();

        Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku01 BukuShamil = new Buku01("Buku Keren", "Mas Faiz", 70, 30, 20000);
        BukuShamil.terjual(5);
        BukuShamil.tampilInformasi();
    
}
}