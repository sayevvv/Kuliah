import java.util.Scanner;
public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input01.nextInt();
        String Jenis = (angka % 2 == 0) ? "Angka " +angka+ " Bilangan genap" : "Angka " +angka+ " Bilangan ganjil";
        System.out.println(Jenis);
        input01.close();
    }

}
