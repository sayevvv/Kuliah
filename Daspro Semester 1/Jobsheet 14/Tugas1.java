import java.util.Scanner;
public class Tugas1 {
    static void descendingrekursif (int n){
        if (n < 0) {
        return;
        }
        descendingrekursif(n-1);
        System.out.println(n+" ");

    }
    

    static void descendingiteratif (int n){
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " ");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Masukkan nilai ke-n :");
    n = sc.nextInt();
    System.out.println("Rekursif: ");
    descendingrekursif(n);
    System.out.println("iteratif: ");
    descendingiteratif(n);
    sc.close();
}
}