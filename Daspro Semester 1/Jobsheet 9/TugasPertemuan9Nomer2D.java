import java.util.Scanner;

public class TugasPertemuan9Nomer2D {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[]bil = new int[8];
        int total = 0, rata2;
        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            bil[i] = Sc.nextInt();
            total += bil[i];
        }
        rata2 = total/bil.length;
        System.out.println("Rata ratanya adalah " + rata2);
        Sc.close();
    }
}
