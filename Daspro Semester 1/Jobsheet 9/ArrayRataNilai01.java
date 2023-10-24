import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arrayLength;
        double totalLulus = 0, totalTdkLulus = 0, pembagi1 = 0, pembagi2 = 0;
        double rata2Lulus, rata2TdkLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        arrayLength = Sc.nextInt();
        int [] nilaiMhs = new int[arrayLength];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-"+ (i+1) + " : ");
            nilaiMhs [i] = Sc.nextInt();

        }
        for ( int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                pembagi1++;
            }
        }
        rata2Lulus = totalLulus/pembagi1;
        System.out.println("Rata rata nilai lulus = " +rata2Lulus);
        
        for ( int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < 70) {
                totalTdkLulus += nilaiMhs[i];
                pembagi2++;
            }
        }
        rata2TdkLulus = totalTdkLulus/pembagi2;
        System.out.println("Rata rata nilai tidak lulus = " +rata2TdkLulus);
        
        Sc.close();
    }
}
