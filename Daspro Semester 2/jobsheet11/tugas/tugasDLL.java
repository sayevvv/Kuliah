package jobsheet11.tugas;

import java.util.Scanner;

public class tugasDLL {
    public static void main(String[] args) throws Exception{
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor Antrian :");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima : ");
                    String namaPenerima = sc.nextLine();
                    dll.addFirst(namaPenerima, nomorAntrian);
                    break;
                case 2:
                    dll.removeFirst();
                    break; 
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
