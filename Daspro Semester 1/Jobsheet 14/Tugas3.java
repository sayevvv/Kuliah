import java.util.Scanner;
public class Tugas3 {
    static boolean cekprima (int n , int div){
        if (n<=1){
            return false;
        }
        if (div==1){
            return true;
        }
        if (n%div ==0){
            return false;
        }
        return cekprima(n, div-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan bilangan : ");
        n = sc.nextInt();

        boolean hasil = cekprima(n, n-1);
        if (hasil) {
            System.out.println( n + " Adalah bilangan prima");
        } else {
            System.out.println(n + " Bukan bilangan prima");}

            sc.close();
    }
    
}