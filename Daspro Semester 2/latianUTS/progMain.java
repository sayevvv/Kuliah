package latianUTS;

import java.util.Scanner;
public class progMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tentukan Berapa kapasitas database : ");
        int pd = sc.nextInt();
        System.out.println(pd);

        Algo list = new Algo(pd);

        Prog[] x = new Prog[pd];
        System.out.println("INPUT DATA");
        sc.nextLine();

        for(int i = 0; i < x.length; i++){
            System.out.println("Input akun ke " + (i+1));
            System.out.print("nomor akun : ");
            String acc = sc.nextLine();
            System.out.print("nama : ");
            String n = sc.nextLine();
            System.out.print("nomor telefon : ");
            String t = sc.nextLine();
            System.out.print("email : ");
            String e = sc.nextLine();
            System.out.print("Saldo : ");
            int s = sc.nextInt();
            sc.nextLine();
            x[i] = new Prog(acc, n, t, e, s);
            list.tambah(x[i]);
        }
        
            System.out.println("1. Display data sebelum sort");
            list.tampil();
            
            System.out.println("2. Display data berdasarkan saldo"); //ASCENDING
            list.insertionSort();
            list.tampil();

            System.out.println("NYOBA BUBBLESORT"); //ASCENDING
            list.bubbleSort();
            list.tampil();

            System.out.println("NYOBA SELECTION SORT"); //DESCENDING
            list.selectionSort();
            list.tampil();


            System.out.println("3. Mencari data berdasarkan nama");
            System.out.print("Masukkan nama barang yang mau dicari : ");
            String cariNama = sc.nextLine();
            int posisiBinNama = list.FindBinarySearchJudul(cariNama, 0, pd-1);
            list.Tampilposisi(cariNama, posisiBinNama);
            list.TampilDataKetemu(cariNama);

            list.tampil();
            System.out.println("Akun ke berapa yang mau kamu tambahkan saldo : ");
            int akunPilihan = sc.nextInt();
            
            System.out.println("1. TAMBAH || 2. TARIK || 3. EXIT");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("==== Tambah Saldo Akun " + x[akunPilihan].accountNumber + " ====");
                    System.out.print("Jumlah saldo yang mau ditambah : ");
                    int tambah = sc.nextInt();
                    x[akunPilihan].TambahSaldo(tambah);
                    break;
                case 2:
                    System.out.println("==== Tarik Saldo Akun " + x[akunPilihan].accountNumber + "====");
                    System.out.println("Jumlah saldo yang mau dikurangi : ");
                    int kurang = sc.nextInt();
                    x[akunPilihan].TarikSaldo(kurang);
                default:
                    
                    break;
            }
    }
}
