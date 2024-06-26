package jobsheet09.Warung;

import java.util.Scanner;

import jobsheet09.Warung.Queue;

public class WarungMain {
    public static void menu(){
        System.out.println("\nPilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek Antrian Berdasarkan nama");
        System.out.println("6. Cek Semua Antrian");
        System.out.println("7. Data Pembeli");
        System.out.println("8. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc02.nextInt();
        Queue antri = new Queue(jumlah);

        int pilih;
        do{
            menu();
            pilih = sc02.nextInt();
            sc02.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("\nNama \t\t: ");
                    String nama = sc02.nextLine();
                    System.out.print("Nomor \t\t: ");
                    int no = sc02.nextInt();

                    pembeli nasabah02 = new pembeli(nama, no);
                    sc02.nextLine();
                    antri.Enqueue(nasabah02);
                    break;

                case 2:
                    pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHP) ) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }
                
                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;
                
                case 5:
                    System.out.print("Masukkan nama pembeli: ");
                    String cariNama = sc02.nextLine();
                    antri.peekPosition(cariNama);
                    break;

                case 6:
                    antri.print();
                    break;

                case 7:
                    antri.daftarPembeli();
                    break;

                case 8:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 );
    }
}
