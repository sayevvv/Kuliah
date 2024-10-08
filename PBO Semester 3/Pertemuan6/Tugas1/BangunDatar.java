package Pertemuan6.Tugas1;

public class BangunDatar {
    private float luas;
    private float keliling;

    public float getLuas() {
        return luas;
    }

    protected void setLuas(float luas) {
        this.luas = luas;
    }

    public float getKeliling() {
        return keliling;
    }

    protected void setKeliling(float keliling) {
        this.keliling = keliling;
    }

    // Metode untuk menghitung luas dan keliling (di-override di kelas turunan)
    public void hitungLuasDanKeliling() {
        // Implementasi default kosong
    }
}
