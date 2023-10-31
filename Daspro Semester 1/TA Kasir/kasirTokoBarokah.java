import java.util.Scanner;

public class kasirTokoBarokah {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String[] listBarang = {"Roti", "Beras", "Telur", "Minyak", "Gula", "Snack", "Rokok", "Mie " };
        double[] harga = {20000, 50000, 15000, 25000, 12000, 8000, 25000, 4000};

        int[] keranjang = new int[listBarang.length];
        double totalHarga = 0;
       
            System.out.println("List Toko Barokah : ");
            for (int i = 0; i < listBarang.length; i++) {
                System.out.println((i+1) + ". " + listBarang[i] + " \tIDR " + harga[i]);
            }
        System.out.println("==========================");
        while (true) {
            System.out.print("Masukkan nomor barang : ");
            int pilihan = Sc.nextInt();

        if (pilihan == 0) {
            break;
        }
        if (pilihan < 1 || pilihan > listBarang.length) {
            System.out.println("Input nomor barang tidak valid");
            continue;
        }
        int indexBarang = pilihan - 1;
        keranjang[indexBarang]++;


        System.out.println("Kamu telah menambahkan " +listBarang[indexBarang] +  " ke dalam keranjang");
        totalHarga += harga[indexBarang];
        }
        
        System.out.println("Keranjang anda : ");
        for (int i = 0; i < listBarang.length; i++) {
            if (keranjang[i] > 0) {
                System.out.println(listBarang[i] + " sejumlah-" + keranjang[i] + " : IDR " + (keranjang[i]*harga[i]));
            }
        }
        System.out.println("Harga Total : IDR " + totalHarga);
        System.out.print("Masukkan uang pembeli\t: IDR ");
                double uangPembeli = Sc.nextDouble(); 
                
                double kembalian = uangPembeli - totalHarga; 
                
                if (kembalian >= 0) {
                    System.out.println("Kembalian \t: " + kembalian); 
                } else {
                    System.out.println("Uang tidak cukup"); 
                }
        Sc.close();
                
        }
    }
