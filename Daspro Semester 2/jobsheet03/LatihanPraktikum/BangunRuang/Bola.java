package jobsheet03.LatihanPraktikum.BangunRuang;

public class Bola {
    public int jari;
    public Bola(int j) {
        jari = j;
    }

    public double hitungPermukaan(){
        return 3.14 * 4 * jari * jari;
    }

    public double hitungVolume(){
        return 4/3 * 3.14 * jari * jari * jari;
    }
}
