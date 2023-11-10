import java.util.Scanner;

public class tugasIndividu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N : ");
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println("Masukkan value N yang benar");
        }
        else {
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}