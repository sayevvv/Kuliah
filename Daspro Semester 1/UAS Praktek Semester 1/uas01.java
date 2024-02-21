import java.util.Scanner;

public class uas01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Nomor Desimal : ");
        int num = sc.nextInt();
        int pilihan;
        do {
            System.out.println("Pilihan Konversi");
            System.out.println("1. Biner");
            System.out.println("2. Octal");
            System.out.println("3. Hexadesimal");
            System.out.print("Pilih (1/2/3):");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Bentuk Biner " + num + " adalah " + Integer.toBinaryString(num));
                    break;
                case 2:
                    System.out.println("Bentuk Oktal " + num + " adalah " + Integer.toOctalString(num));
                    break;
                case 3:
                    System.out.println("Bentuk Hexadesimal " + num + " adalah " + Integer.toHexString(num));
                    break;
                default:
                    System.out.println("Pilihan invalid");
                    break;
            }
        } while(pilihan < 1 || pilihan > 3);
        sc.close();
    }
}