import java.util.Scanner;
public class Tugas2 {
    static int penjumlahanrekursif (int n){
        if (n==1){
            System.out.print("1");
            return 1;

        } else {
        int hasilsebelumnya = penjumlahanrekursif(n-1);
        System.out.print(" + " + n);
         return n + hasilsebelumnya;
        } 
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan angka : ");
        n = sc.nextInt();

        
        System.out.print("penjumlahan 1 sampai " + n + " adalah ");
        int hasil = penjumlahanrekursif(n);
        System.out.println(" = " + hasil);
        sc.close();
    }
    
}