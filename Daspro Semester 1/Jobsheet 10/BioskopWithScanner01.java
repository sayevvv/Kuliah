import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next, nama;
        int kolom, baris;

        String [][] penonton = new String[4][2];
        while (true) {
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Baris: ");
            baris = sc.nextInt();
            System.out.println("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom -1] = nama;

            System.out.println("Input nama penonton lainnya? (y/n)");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    sc.close();
    }
}
