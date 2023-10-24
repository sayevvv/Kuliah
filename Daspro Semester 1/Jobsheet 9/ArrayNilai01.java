import java.util.Scanner;
public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = Sc.nextInt();
            }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" +i+ " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" +i+ "tidak lulus!");
            }
        } Sc.close();
            }
        }
    

