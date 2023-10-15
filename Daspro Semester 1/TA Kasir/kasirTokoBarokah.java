import java.util.Scanner;

public class kasirTokoBarokah {
      public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                
                // Deklarasi variabel
                double totalHarga = 0.0, hargaBarang = 0;
                boolean lanjutBelanja = true, barangValid = true;
                int roti = 20000, beras = 50000, telur = 15000, minyak = 25000, gula = 12000, snack = 8000, rokok = 25000;
                String namaBarang;

                System.out.println("Toko Barokah");
                System.out.println("==========================");
                System.out.println("List Barang Toko Barokah : ");
                System.out.println("Roti \t\t: 20000");
                System.out.println("Beras \t\t: 50000");
                System.out.println("Telur 1 kg \t: 15000");
                System.out.println("Minyak \t\t: 25000");
                System.out.println("Gula \t\t: 12000");
                System.out.println("Snack \t\t: 8000");
                System.out.println("Mie Instan\t: 4000");
                System.out.println("Rokok \t\t: 25000");
                System.out.println("==========================");

                System.out.println("Kasir Toko Barokah");
                
                while (lanjutBelanja) {
                    System.out.println("==============================================");
                    do {
                        System.out.print("Masukkan nama barang yang anda beli \t: ");
                        namaBarang = input.next(); // INPUT NAMA BARANG
                    
                        switch(namaBarang.toLowerCase()) {
                        case "roti" :
                        hargaBarang = roti;
                        break;
                        case "beras" :
                        hargaBarang = beras;
                        break;
                        case "telur" :
                        hargaBarang = telur;
                        break;
                        case "minyak" :
                        hargaBarang = minyak;
                        break;
                        case "gula" :
                        hargaBarang = gula;
                        break;
                        case "snack" :
                        hargaBarang = snack;
                        break;
                        case "rokok" :
                        hargaBarang = rokok;
                        break;
                        default :
                        System.out.println("Barang tidak tersedia atau anda salah input");
                        barangValid = false;
                        break;
                         } 
                    } while(barangValid == false);
                    
                    
                    System.out.print("Masukkan jumlah barang \t: ");
                    int jumlah = input.nextInt(); // INPUT JUMLAH BARANG
                    
                    double totalBarang = hargaBarang * jumlah; // OPERASI BARANG DIKALI JUMLAH
                    totalHarga += totalBarang; // OPERASI BARANG DIMASUKKAN KE DALAM TOTAL HARGA
                    
                    System.out.println(namaBarang + " seharga " + hargaBarang  + " x "+ jumlah + " = " + totalBarang );
                    
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
        
        

    







       
    
    
