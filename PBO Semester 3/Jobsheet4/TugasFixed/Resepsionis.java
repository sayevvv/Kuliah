package Jobsheet4.TugasFixed;

public class Resepsionis  extends Orang{
    public Resepsionis() {}

    public void sambutTamu(String namaTamu) {
        System.out.println("Selamat datang " + namaTamu + ", kami siap melayani Anda!");
    }

    // Override method info untuk menampilkan informasi tambahan
    public void info() {
        super.info();  // Memanggil method info() dari Orang
    }
}
