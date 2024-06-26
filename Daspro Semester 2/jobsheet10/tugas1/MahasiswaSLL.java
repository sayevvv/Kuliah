package jobsheet10.tugas1;

public class MahasiswaSLL {
    String nim, nama;

    public MahasiswaSLL(){

    }

    public MahasiswaSLL(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public void print(){
        System.out.println("NIM = "+nim);
        System.out.println("Nama = "+nama);
    }
}
