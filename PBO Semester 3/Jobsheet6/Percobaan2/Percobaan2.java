package Jobsheet6.Percobaan2;

public class Percobaan2 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        hitung.setX(20);
        hitung.setY(30);
        hitung.setZ(5);
        System.out.println(hitung.getNilai());
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}
