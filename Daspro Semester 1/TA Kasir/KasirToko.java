import java.util.Scanner;

public class KasirToko {
      public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                
                // Deklarasi variabel
                double totalHarga = 0.0;
                boolean lanjutBelanja = true;
  
                System.out.println("Toko Bismillah");
                System.out.println("==========================");
                System.out.println("List Barang Toko Bismillah : ");
                System.out.println("Roti \t\t: 20000");
                System.out.println("Beras \t\t: 50000");
                System.out.println("Telur 1 kg \t: 15000");
                System.out.println("Minyak \t\t: 25000");
                System.out.println("Gula \t\t: 12000");
                System.out.println("Snack \t\t: 8000");
                System.out.println("Mie Instan\t: 4000");
                System.out.println("Rokok \t\t: 25000");
                System.out.println("==========================");

                
                System.out.println("Kasir Toko Bismillah");
                
                while (lanjutBelanja) {
                    System.out.println("==============================================");
                    System.out.print("Masukkan nama barang yang anda beli \t: ");
                    String namaBarang = input.next(); // INPUT NAMA BARANG
                    
                    System.out.print("Masukkan harga barang yang anda beli \t: IDR ");
                    double hargaBarang = input.nextDouble(); // INPUT HARGA BARANG
                    
                    System.out.print("Masukkan jumlah barang \t: ");
                    int jumlah = input.nextInt(); // INPUT JUMLAH BARANG
                    
                    double totalBarang = hargaBarang * jumlah; // OPERASI BARANG DIKALI JUMLAH
                    totalHarga += totalBarang; // OPERASI BARANG DIMASUKKAN KE DALAM TOTAL HARGA
                    
                    System.out.println(namaBarang + " seharga IDR" + hargaBarang + " x " + jumlah+ " = IDR" + totalBarang); // OUTPUT HASIL BELANJA
                    
                    System.out.print("Apakah kamu mau lanjut belanja? (ya/tidak): ");
                    String lanjut = input.next();
                    lanjutBelanja = lanjut.equalsIgnoreCase("ya");
                }
                
                System.out.println("Total Harga: $" + totalHarga);
                
                System.out.print("Masukkan uang pembeli\t: IDR ");
                double uangPembeli = input.nextDouble(); // INPUT UANG PEMBELI
                
                double kembalian = uangPembeli - totalHarga; // OPERASI KEMBALIAN
                
                if (kembalian >= 0) {
                    System.out.println("Kembalian Anda \t: " + kembalian); // OUTPUT KEMBALIAN
                } else {
                    System.out.println("Uang tidak cukup"); // OUTPUT UANG TIDAK CUKUP
                }
                
                input.close();
                System.out.println("Terimakasih!");
                System.out.println("==============================================");
            }
        }
        
        

    







       
    
    