import java.util.Scanner;

public class tugasIndividu03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input N: ");
        int size = scanner.nextInt();
        if (size < 3) {
            System.out.println("Input value N yang benar");
            System.exit(0);
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(size + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
