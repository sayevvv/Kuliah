import java.util.Scanner;

public class uas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String masukan = sc.nextLine();

        String stringBersih = masukan.replaceAll(" ", "").toLowerCase();
        String stringTerbalik = new StringBuilder(stringBersih).reverse().toString();

        if (stringBersih.equals(stringTerbalik)) {
            System.out.println(masukan + " adalah palindrom");
        } else {
            System.out.println(masukan + " bukan palindrom");
        }

        sc.close();
    }
}
