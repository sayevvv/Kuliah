import java.util.Scanner;

public class TugasPertemuan9Nomer2C {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String[] bulan = new String[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Input bulan ke-"+(i+1)+ " : ");
            bulan[i] = Sc.nextLine();
        }
        for (int i = 0; i < 12; i++) {
            System.out.println("Bulan ke-"+ (i+1)+ " adalah " + bulan[i]);
        } Sc.close();
    }
}
