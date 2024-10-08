package Pertemuan6.Tugas1;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuasDanKeliling() {
        float luas = (alas * tinggi) / 2;

        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        float keliling = alas + tinggi + sisiMiring;


        setLuas(luas);
        setKeliling(keliling);
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }
}
