import java.util.Scanner;

public class tugasIndividu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input angka : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
