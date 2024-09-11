package Jobsheet2.Tugas;

public class DVDGame {
    String id_DVDgame, nama_DVDGame, genre_DVDGame;
    int stok_DVDGame, harga_DVDGame;

    public DVDGame(String id_new, String nama_new, String genre_new, int stok_new, int harga_new){
        id_DVDgame = id_new;
        nama_DVDGame = nama_new;
        genre_DVDGame = genre_new;
        stok_DVDGame = stok_new;
        harga_DVDGame = harga_new;
    }

    public String getNamaDvdGame() {
        return nama_DVDGame;
    }

    public void tampilBarang(){
        System.out.println("Id Game : " + id_DVDgame);
        System.out.println("Nama Game : " + nama_DVDGame);
        System.out.println("Genre Game : " + genre_DVDGame);
        System.out.println("Stok Game : " + stok_DVDGame);
        System.out.println("Harga Game : " + harga_DVDGame);
    }
    public void ubahStok(int stok_tambah){
        stok_DVDGame += stok_tambah;
    }
    public void ubahHarga(int harga_ubah){
        harga_DVDGame = harga_ubah;
    }
    //berdasarkan soal, ini berarti konstruktor 2 cuma function aja
    public void ubahData(String id_new, String nama_new, String genre_new, int stok_new, int harga_new){
        id_DVDgame = id_new;
        nama_DVDGame = nama_new;
        genre_DVDGame = genre_new;
        stok_DVDGame = stok_new;
        harga_DVDGame = harga_new;
    }
}
