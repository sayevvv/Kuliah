package jobsheet03.LatihanPraktikum.BangunRuang;

public class Limas {
    public int sisiAlas, tinggi;
    public Limas(int a, int t) {
        sisiAlas = a;
        tinggi = t;
    }
    public double hitungPermukaan() {
        return sisiAlas * sisiAlas + (Math.sqrt(sisiAlas/2 * sisiAlas/2 + tinggi * tinggi) * sisiAlas / 2);
    }
    public double hitungVolume() {
        return 1/3 * sisiAlas * sisiAlas * tinggi;
    }
}
