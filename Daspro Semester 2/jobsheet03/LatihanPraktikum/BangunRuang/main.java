package jobsheet03.LatihanPraktikum.BangunRuang;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" K E R U C U T ");
        Kerucut[] krArray = new Kerucut[2];
        for(int i = 0; i < krArray.length; i++) {
            System.out.println("Input Elemen ke-" + i);
            System.out.print("Input Jari :");
            int j = sc.nextInt();
            System.out.print("Input Sisi Miring :");
            int s = sc.nextInt();
            krArray[i] = new Kerucut(j, s);
        }
        for(int i = 0; i < krArray.length; i++){
            System.out.println("Luas Permukaan : " + krArray[i].hitungPermukaan() + ", Volume : " + krArray[i].hitungVolume());
        }


        System.out.println(" L I M A S");
        Limas[] lmArray = new Limas[2];
        for(int i = 0; i < lmArray.length; i++) {
            System.out.println("Input Elemen ke-" + i);
            System.out.print("Input sisi alas :");
            int s = sc.nextInt();
            System.out.print("Input tinggi : ");
            int t = sc.nextInt();
            lmArray[i] = new Limas(s, t);
        }
        for(int i = 0; i < lmArray.length; i++){
            System.out.println("Luas Permukaan : " + lmArray[i].hitungPermukaan() + ", Volume : " + lmArray[i].hitungVolume());
        }
        System.out.println(" B O L A ");
        Bola[] blArray = new Bola[2];
        for(int i = 0; i < blArray.length; i++) {
            System.out.print("Input Jari-jari :");
            int j = sc.nextInt();
            blArray[i] = new Bola(j);
        }
        for(int i = 0; i < blArray.length; i++){
            System.out.println("Luas Permukaan : " + blArray[i].hitungPermukaan() + ", Volume : " + blArray[i].hitungVolume());
        }
    }
}
