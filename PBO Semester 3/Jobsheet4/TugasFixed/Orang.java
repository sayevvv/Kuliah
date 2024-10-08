package Jobsheet4.TugasFixed;

public class Orang {
    protected String nama;  // Protected agar bisa diakses oleh subclass

    public Orang() {}

    public void setNama(String newValue) {
        nama = newValue;
    }

    public String getNama() {
        return nama;
    }

    // Method info untuk menampilkan data umum
    public void info() {
        System.out.println("Nama: " + nama);
    }
}
