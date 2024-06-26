package jobsheet03;

import java.util.Scanner;

public class ArrayObjects2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[][] ppArray = new PersegiPanjang[3][2];
       ppArray[0][1] = new PersegiPanjang();
       ppArray[0][1].panjang = 99;
       System.out.println("BUKTI : " + ppArray[0][1].panjang);

    }
}
