import java.util.Scanner;

public class MencariAngka {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("Input Bilangan 1 : ");
        bil1 = input01.nextInt();
        System.out.print("Input Bilangan 2 : ");
        bil2 = input01.nextInt();
        System.out.print("Input Bilangan 3 : ");
        bil3 = input01.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan Terbesar : " + bil1);
            } else {
                System.out.println("Bilangan Terbesar " + bil3);
            }
        }else {
            if (bil2 > bil3 ) {
                System.out.println("Bilangan Terbesar : " + bil2);
            } else {
                System.out.println("Bilangan Terbesar : " + bil3);
            }
        } input01.close();
    }
}
