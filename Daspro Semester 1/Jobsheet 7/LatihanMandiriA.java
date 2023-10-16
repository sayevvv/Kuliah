import java.util.Scanner;

public class LatihanMandiriA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int femaleCount = 0;
        String nama, jenis;
        System.out.println("Masukkan nama 30 siswa");

        for (int i = 0; i < 30; i++) {
            System.out.print("Input nama siswa : ");
            nama = sc.nextLine();
            System.out.print("Input jenis kelamin (laki/perempuan) : ");
            jenis = sc.nextLine();

            if (jenis.equalsIgnoreCase("perempuan")) {
                System.out.println(nama);
                femaleCount++;
            } else {
                continue;
            }
            if (femaleCount == 0) {
                System.out.println("Tidak ada siswa perempuan");
            }
        } sc.close();
    }
}