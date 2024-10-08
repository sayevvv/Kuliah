package Pertemuan6.Tugas1;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lingkaran lg1 = new Lingkaran(4);
        lg1.hitungLuasDanKeliling();
        System.out.println("Luas Lingkaran: " + lg1.getLuas());
        System.out.println("Keliling Lingkaran: " + lg1.getKeliling());

        PersegiPanjang pp1 = new PersegiPanjang(5, 3);
        pp1.hitungLuasDanKeliling();        System.out.println("Luas Persegi Panjang: " + pp1.getLuas());
        System.out.println("Keliling Persegi Panjang : " + pp1.getKeliling());

        Segitiga sg1 = new Segitiga(4, 5);
        sg1.hitungLuasDanKeliling();
        System.out.println("Luas Segitiga: " + sg1.getLuas());
        System.out.println("Keliling Segitiga: " + sg1.getKeliling());
    }
    
}
