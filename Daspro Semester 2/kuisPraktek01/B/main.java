package B;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang array : ");
        int i = sc.nextInt();
        sc.nextLine();
        mobil[] mArray = new mobil[i];
        
        for(int j = 0; j<mArray.length; j++){
            System.out.print("nama mobil : ");
            String n = sc.nextLine();
            System.out.print("cc mobil : ");
            int c = sc.nextInt();
            System.out.print("harga mobil : ");
            int h = sc.nextInt();
            System.out.print("tahun produksi mobil : ");
            int t = sc.nextInt();
            sc.nextLine();
            mArray[j] = new mobil(n, c, h, t);
        }
        for(int x = 0; x < mArray.length; x++){
            mArray[x].printData();
        }
        sc.close();
    }
    
}