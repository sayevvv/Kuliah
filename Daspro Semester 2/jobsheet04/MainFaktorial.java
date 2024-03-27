package jobsheet04;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[10];
        for(int i=0; i < iJml; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i+1)+":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }
        System.out.println("Hasil - Brute Force");
        for(int i =0; i < iJml; i++){
            System.out.println(
                "Hasil perhitungan faktorial menggunakan Brute Force :"
                + fk[i].faktorialBF(fk[i].nilai)
            );
        }
        System.out.println("Hasil - DIVIDE AND CONQUER");
        for(int i = 0; i < iJml; i++){
            System.out.println("Hasil perhitungan menggunakan Divide and Conquer" + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
