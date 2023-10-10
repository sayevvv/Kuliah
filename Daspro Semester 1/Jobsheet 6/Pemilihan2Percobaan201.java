import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        float sudut1, sudut2, sudut3, totalSudut;
        Scanner input01 = new Scanner(System.in);
        System.out.print("Sudut 1 : ");
        sudut1 = input01.nextFloat();
        System.out.print("Sudut 2 : ");
        sudut2 = input01.nextFloat();
        System.out.print("Sudut 3 : ");
        sudut3 = input01.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) 
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
             else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) 
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else 
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else {
            System.out.println("Bukan Segitiga"); }
            input01.close();
        }
}
