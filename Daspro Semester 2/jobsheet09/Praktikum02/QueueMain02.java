package jobsheet09.Praktikum02;

import java.util.Scanner;

public class QueueMain02 {
     public static void menu(){
        System.out.println("\nPilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue02 antri = new Queue02(jumlah);

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("\nNo Rekening \t: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama \t\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat \t\t: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur \t\t: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo \t\t: ");
                    double saldo = sc.nextDouble();

                    Nasabah nasabah02 = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nasabah02);
                    break;

                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                    && data.umur !=0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                        + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                
                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;
                
                case 5:
                antri.print();
                break;
            }
        }
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
