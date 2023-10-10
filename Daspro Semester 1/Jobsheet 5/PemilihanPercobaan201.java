import java.util.Scanner;

public class PemilihanPercobaan201 {

    public static void main (String [] args) {
        Scanner input00= new Scanner(System.in);
        System.out.print("Nilai uas\t: ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts\t: ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis\t: ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas\t: ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        if (total > 80 && total <= 100) {
            char nilaiHuruf = 'A';
            System.out.println("Nilai akhir = " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if (total <= 80 && total > 73) {
            String nilaiHuruf = "B+";
            System.out.println("Nilai akhir = " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if ( total <= 73 && total > 65) {
            char nilaiHuruf = 'B';
            System.out.println("Nilai akhir : " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if (total <= 65 && total > 60) {
            String nilaiHuruf = "C+";
            System.out.println("Nilai akhir = " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if (total <= 60 && total> 50 ) {
            char nilaiHuruf = 'C';
            System.out.println("Nilai akhir = " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if (total <= 50 && total > 39) {
            char nilaiHuruf = 'D';
            System.out.println("Nilai akhir = " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else if (total <= 39 && total >= 0) {
            char nilaiHuruf = 'E';
            System.out.println("Nilai akhir + " + total + " Nilai Huruf = " + nilaiHuruf);
        }
        else {
            System.out.println("Error, input nilai anda invalid");
        }
        
        input00.close();
    }
}