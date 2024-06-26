package jobsheet10.tugas2;

public class Mahasiswa {
    String nim;
    String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
