package UAS_ALSD_Shamil.uasPraktek;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

       
        BarangRental[] daftarBarang1 = new BarangRental[10];
        //Biaya Sewa perjam untuk motor adalah 25000 dan Mobil 40000
        daftarBarang1[0] = new BarangRental("S 1234 ABC", "Honda Beat", "Motor", 2017, 25000);
        daftarBarang1[1] = new BarangRental("B 5678 XYZ", "Honda Vario", "Motor", 2019, 25000);
        daftarBarang1[2] = new BarangRental("B 4321 DEF", "BMW e36", "Motor", 2021, 40000);
        daftarBarang1[3] = new BarangRental("B 8765 UVW", "CBR 150R", "Motor", 2020, 25000);
        daftarBarang1[4] = new BarangRental("B 9999 JKL", "Lamborghini Aventador", "Mobil", 2018, 40000);

        DLL dll = new DLL();

        for (BarangRental barang : daftarBarang1) { // Saya Menggunakan DLL, agar cepat saya masukkan kedalam dll, saya menggunakan for each
            dll.addFirst(barang);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan transaksi urut no TNKB");
        System.out.print("Pilih (1-5) : ");
        int x = sc.nextInt();
        switch (x) {
            case 1: // NOMOR 2
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan Rental Serba Serbi");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("Nomor TNKB\t\tNama Kendaraan\t\tJenis\t\tTahun\tBiaya Sewa Perjam");
            for (BarangRental barang : daftarBarang1) {
                System.out.println(barang.getNoTNKB() + "\t" + barang.getNamaKendaraan() + "\t" + barang.getJenisKendaraan() + "\t" +
                        barang.getTahun() + "\t" + barang.getBiayaSewa());
            }
                break;
            case 2: //NOMER 3
            sc.nextLine();
            System.out.println("---------------------------");
            System.out.print("Masukkan Nama Peminjam : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Nomer TNKB : ");
            String tnkb = sc.nextLine();
            System.out.print("Masukkan Lama Pinjam : ");
            int lama = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println("Apakah Member? (ya / tidak)");
            String ya = sc.nextLine();
            
            BarangRental barangDipilih = null;
            
            // Mencari data yang sesuai dengan no tnkb
            for (BarangRental barang : daftarBarang1) {
                if (barang.getNoTNKB().equalsIgnoreCase(tnkb)) {
                    barangDipilih = barang;
                    break; // Keluar dari loop setelah barang ditemukan
                }
            }
            
            // Jika barang tidak ditemukan
            if (barangDipilih == null) {
                System.out.println("Barang dengan Nomor TNKB " + tnkb + " tidak ditemukan.");
            } else {

                // Menghitung Total Biaya serta diskon sesuai jamnya 
                int biayaSewa = barangDipilih.getBiayaSewa();
                int totalBiaya;
                if (lama >= 48 && lama <= 72) {
                        // Diskon 10%
                        int diskon = (int) (biayaSewa * lama * 0.1);
                        totalBiaya = biayaSewa * lama - diskon;
                        System.out.println("Total biaya setelah diskon 10%: " + totalBiaya);
                } else if (lama > 72) {
                        // Diskon 20%
                        int diskon = (int) (biayaSewa * lama * 0.2);
                        totalBiaya = biayaSewa * lama - diskon;
                        System.out.println("Total biaya setelah diskon 20%: " + totalBiaya);
                } else {
                        // Tidak ada diskon
                        totalBiaya = biayaSewa * lama;
                        System.out.println("Total biaya: " + totalBiaya);
                }

                    
                // Menampilkan pinjaman
                System.out.println("Data Peminjaman:");
                System.out.println("Nama Peminjam: " + nama);
                System.out.println("Nomor TNKB: " + tnkb);
                System.out.println("Nama Barang: " + barangDipilih.getNamaKendaraan());
                System.out.println("Lama Pinjam: " + lama + " jam");
                System.out.println("Total Biaya: " + totalBiaya);
            break;
        }
    }

        }
    }    

