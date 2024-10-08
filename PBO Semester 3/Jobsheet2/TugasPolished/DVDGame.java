package Jobsheet2.TugasPolished;

public class DVDGame {
    private String id_DVDgame;
    private String nama_DVDGame;
    private String genre_DVDGame;
    private int stok_DVDGame;
    private int harga_DVDGame;

    // Constructor
    public DVDGame(String id_new, String nama_new, String genre_new, int stok_new, int harga_new) {
        this.id_DVDgame = id_new;
        this.nama_DVDGame = nama_new;
        this.genre_DVDGame = genre_new;
        this.stok_DVDGame = stok_new;
        this.harga_DVDGame = harga_new;
    }

    // Getter methods
    public String getNamaDvdGame() {
        return nama_DVDGame;
    }

    public int getStokDvdGame(){
        return stok_DVDGame;
    }

    public void setStokBerkurang(int dipinjam) {
        if (stok_DVDGame >= dipinjam) {
            this.stok_DVDGame -= dipinjam;
        } else {
            System.out.println("Stok tidak cukup untuk dipinjam.");
        }
    }
    

    public int getHargaDvdGame() {
        return harga_DVDGame;
    }

    // Display the details of the DVD game
    public void tampilBarang() {
        System.out.println("Id Game\t\t: " + id_DVDgame);
        System.out.println("Nama Game\t: " + nama_DVDGame);
        System.out.println("Genre Game\t: " + genre_DVDGame);
        System.out.println("Stok Game\t: " + stok_DVDGame);
        System.out.println("Harga Game\t: " + harga_DVDGame);
    }

    // Modify stock
    public void ubahStok(int stok_tambah) {
        this.stok_DVDGame += stok_tambah;
    }

    // Modify price
    public void ubahHarga(int harga_ubah) {
        this.harga_DVDGame = harga_ubah;
    }

    // Update all DVD data
    public void ubahData(String id_new, String nama_new, String genre_new, int stok_new, int harga_new) {
        this.id_DVDgame = id_new;
        this.nama_DVDGame = nama_new;
        this.genre_DVDGame = genre_new;
        this.stok_DVDGame = stok_new;
        this.harga_DVDGame = harga_new;
}
}