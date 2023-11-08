import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                 if (answer > number) {
                     System.out.println("Input nilai tebakan lebih besar dari jawaban");
                 }
                 if (answer < number) {
                     System.out.println("Input nilai tebakan lebih kecil dari jawaban");
                 }
                success = (answer == number);
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu=='Y' || menu == 'y');
        sc.close();
    }
}
