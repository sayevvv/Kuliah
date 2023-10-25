import java.util.Scanner;

public class TugasJobsheet9Nomer1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int banyakNilai, jumlah = 0, rata2 = 0;
        System.out.print("Masukkan jumlah nilai : ");
        banyakNilai = Sc.nextInt();
        int [] nilai = new int[banyakNilai];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan jumlah nilai ke-"+ (i+1) + " : " );
            nilai[i] = Sc.nextInt();
            jumlah += nilai[i];
        }
        rata2 = jumlah/nilai.length;
        System.out.println("Nilai rata2 : " + rata2);

        int max = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println("Nilai terbesar : " + max);
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (min > nilai[i] ) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai terkecil : " + min);
        Sc.close();
    }
}
