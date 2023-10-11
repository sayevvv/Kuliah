import java.util.Scanner;

public class ForKelipatan01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;
        int rataRata;
        

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = Sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        rataRata = jumlah / counter;
        System.out.printf("Rata rata dari seluruh bagian kelipatan adalah %d\n",rataRata);
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        
    Sc.close();
    }
}

