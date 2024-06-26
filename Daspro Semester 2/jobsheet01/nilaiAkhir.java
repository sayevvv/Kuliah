package jobsheet01;
import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkhir = 0;
        String nilaiHuruf = "";
        boolean valid = true;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai Uts: ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS = sc.nextInt();
        System.out.println("=======================");
        System.out.println("=======================");

        if (nilaiTugas > 100 ||  nilaiTugas < 0 || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUTS > 100 || nilaiUTS < 0 || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("nilai tidak valid");
            valid = false;
        } else {
            nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
            System.out.println("Nilai Akhir : " +nilaiAkhir);
        }
        
        if( valid) {
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if(nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if(nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if(nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if(nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if(nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else{
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }
        System.out.println("=======================");
        System.out.println("=======================");
        sc.close();
    }
}
