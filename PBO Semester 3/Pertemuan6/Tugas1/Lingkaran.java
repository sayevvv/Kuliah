package Pertemuan6.Tugas1;

public class Lingkaran extends BangunDatar {
    private float r; 

    public Lingkaran(float r) {
        this.r = r;
    }
    @Override
    public void hitungLuasDanKeliling() {
  
        float luas = (float) (Math.PI * r * r);
        float keliling = (float) (2 * Math.PI * r);

        setLuas(luas);
        setKeliling(keliling);
    }

    public float getRadius() {
        return r;
    }
}
