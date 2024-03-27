package jobsheet04;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int nPerusahaan = sc.nextInt();

        Sum[] perusahaan = new Sum[nPerusahaan];

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i] = new Sum();
            perusahaan[i].nomor = i +1;
            perusahaan[i].input(sc);
        }

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i].hitungKeuntungan();
            System.out.println(
                "Total keuntungan perusahaan " + 
                (i + 1) + " selama " +
                perusahaan[i].jumlahBulan + 
                " bulan adalah " + perusahaan[i].totalKeuntungan);
        }
    }
}
