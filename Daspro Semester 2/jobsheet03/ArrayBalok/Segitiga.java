package jobsheet03.ArrayBalok;

public class Segitiga {
    public int alas, tinggi;
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return alas * tinggi / 2;
    }
    public double hitungKeliling(){
        double s = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + s;
    }
}
