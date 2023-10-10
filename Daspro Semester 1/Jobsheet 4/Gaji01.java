import java.util.Scanner;

public class Gaji01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Jumlah Gaji per Hari Anda : ");
        gaji = input.nextInt();
        System.out.print("Masukkan Jumlah Pot Gaji per Tidak Masuk Satu Hari Anda : ");
        potGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja anda : ");
        JmlTdkMasuk = input.nextInt();

        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah : " + TotGaji);

input.close();
    }
}
