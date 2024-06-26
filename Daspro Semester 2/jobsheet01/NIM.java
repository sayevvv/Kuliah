package jobsheet01;
import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 1));

        if (n < 10) {
            n += 10;
        }
        System.out.println("==============");
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}
