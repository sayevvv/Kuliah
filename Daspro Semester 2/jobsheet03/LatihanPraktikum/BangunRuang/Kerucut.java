package jobsheet03.LatihanPraktikum.BangunRuang;

public class Kerucut {
    public int jari, sisimiring;

    public Kerucut(int j, int s) {
        jari = j;
        sisimiring = s;
    }
    public double hitungPermukaan() {
        return 3.14 * jari * (jari + sisimiring);
    }
    public double hitungVolume(){
        return 1/3 * 3.14 * jari * jari * Math.sqrt(sisimiring * sisimiring - jari * jari);
    }
}
