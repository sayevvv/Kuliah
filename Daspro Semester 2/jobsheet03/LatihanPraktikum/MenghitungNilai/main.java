package jobsheet03.LatihanPraktikum.MenghitungNilai;

import java.util.Scanner;

import jobsheet06.bubbleSelectionInsertion.Main;

public class main {

    double cariTerbesar(int[] arr) {
        double max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    double cariRataRata(int[] arr) {
        double hitung = 0;
        for(int i = 0; i < arr.length; i++) {
            hitung += arr[i];
        }
        return hitung / arr.length;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah mahasiswa :");
        int jumlah = sc.nextInt();
        sc.nextLine();
        mahasiswa[] mhArray = new mahasiswa[jumlah];
        for(int i = 0; i < mhArray.length; i++){
            System.out.println("Masukkan data mahasiswa ke " + (i + 1));
            System.out.print("Masukkan nama :");
            String nm = sc.nextLine();
            System.out.print("NIM : ");
            String n = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin");
            String p = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            mhArray[i] = new mahasiswa(n, p, nm, ipk);
            sc.nextLine();
        }
        int[] ipkArray = new int[mhArray.length];
        for (int i = 0; i < mhArray.length; i++){
            ipkArray[i] = (int) mhArray[i].ipk;
        }
        for(int i = 0; i < mhArray.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            System.out.println("Nama : " + mhArray[i].nama);
            System.out.println("NIM : " + mhArray[i].nim);
            System.out.println("Jenis Kelamin : " + mhArray[0].kelamin);
            System.out.println("Nilai IPK : " + mhArray[i].ipk);
        }
        main myMainObject = new main();
        
        System.out.println("Avarage IPK : " + myMainObject.cariRataRata(ipkArray));
        System.out.println("Nilai Terbesar : " + myMainObject.cariTerbesar(ipkArray));

    }
}
