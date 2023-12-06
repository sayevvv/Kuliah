import java.util.Scanner;
public class Tugas4 {
    
    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }else if(bulan < 1) {
            return 0;
        }else {
            return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 1);
        }
    }
        
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);

                System.out.print("Masukkan jumlah bulan : ");
                int bulan = sc.nextInt();
        
                System.out.println("========================================================================================");
                System.out.println("|Bulan|\t\t|pasangan produktif|\t|Pasangan Belum produktif|\t|Total Pasangan|");
                System.out.println("========================================================================================");
                
                for (int i = 1; i <= bulan; i++) {
                    int totPas = hitungPasanganMarmut(i);
                    int jmlPasangan = hitungPasanganMarmut(i - 1);
                    int blmproduktif = hitungPasanganMarmut(i - 2);
                    System.out.println(i + "\t\t\t" +blmproduktif+"\t\t\t"+ jmlPasangan + "\t\t\t\t" + totPas);
                }
                
                sc.close();
            }
        }
        
    