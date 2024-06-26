package jobsheet05;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int element = sc.nextInt();

        Pangkat[] png = new Pangkat[element];
        for(int i=0; i < element; i++){
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat); 
        }
        boolean x = true;
        int choose = 0;
        while(x){
            System.out.println("Brute Force (1) / Divide and Conquer (2)");
            System.out.print("Choose : ");
            choose = sc.nextInt();
            if(choose > 2 || choose < 1){
                System.out.println("Invalid, isi lagi");
            }else {
                x=false;
            }
        }
        switch (choose) {
            case 01:
            System.out.println("HASIL PANGKAT - Brute Force");
            for(int i=0; i<element; i++){
                System.out.println(
                    "Hasil dari " 
                    + png[i].nilai+ " pangkat "
                    + png[i].pangkat+  " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                );
            }   
                break;
            case 02:
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
            for(int i=0; i<element; i++){
                System.out.println(
                    "Hasil dari "+ png[i].nilai+ " pangkat "
                    + png[i].pangkat+ " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                );
            }
            break;
            default:
            System.out.println("invalid rek");
            break;
        }
        
    }
    
}
