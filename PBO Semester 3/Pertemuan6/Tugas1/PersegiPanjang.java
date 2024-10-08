package Pertemuan6.Tugas1;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;


    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    @Override
    public void hitungLuasDanKeliling() {
     
        float luas = panjang * lebar;
        float keliling = 2 * (panjang + lebar);


        setLuas(luas);
        setKeliling(keliling);
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }
}
