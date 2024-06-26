package jobsheet14.tugas1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        List<MataKuliah> daftarMataKuliah = new ArrayList<>();
        List<Nilai> daftarNilai = new ArrayList<>();

        // Input data Mahasiswa
        System.out.println("Masukkan data mahasiswa:");
        daftarMahasiswa.add(new Mahasiswa("191234567", "John Doe", "08123456789"));
        daftarMahasiswa.add(new Mahasiswa("191234568", "Jane Doe", "08123456788"));

        // Input data Mata Kuliah
        System.out.println("Masukkan data mata kuliah:");
        daftarMataKuliah.add(new MataKuliah("MK1", "Pemrograman Java", 3));
        daftarMataKuliah.add(new MataKuliah("MK2", "Struktur Data", 4));

        // Menu utama
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    // Input Nilai
                    System.out.println("\nDaftar Mata Kuliah:");
                    for (MataKuliah mk : daftarMataKuliah) {
                        System.out.println(mk.toString());
                    }
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMataKuliah = scanner.nextLine();

                    MataKuliah mataKuliahTerpilih = null;
                    for (MataKuliah mk : daftarMataKuliah) {
                        if (mk.getKode().equals(kodeMataKuliah)) {
                            mataKuliahTerpilih = mk;
                            break;
                        }
                    }

                    if (mataKuliahTerpilih == null) {
                        System.out.println("Kode Mata Kuliah tidak ditemukan.");
                        break;
                    }

                    System.out.print("Masukkan Nilai: ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine();  // membersihkan newline dari buffer

                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println(mhs.toString());
                    }
                    System.out.print("Pilih Mahasiswa dengan NIM: ");
                    String nimMahasiswa = scanner.nextLine();

                    Mahasiswa mahasiswaTerpilih = null;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimMahasiswa)) {
                            mahasiswaTerpilih = mhs;
                            break;
                        }
                    }

                    if (mahasiswaTerpilih == null) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                        break;
                    }

                    // Menambahkan nilai ke daftar nilai
                    daftarNilai.add(new Nilai(mahasiswaTerpilih, mataKuliahTerpilih, nilai));
                    System.out.println("Nilai berhasil dimasukkan.");
                    break;

                case 2:
                    // Tampil Nilai
                    System.out.println("\nDaftar Nilai Mahasiswa:");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    System.out.println("--------------------------------------------------------------");
                    for (Nilai nilaiMahasiswa : daftarNilai) {
                        Mahasiswa mhs = nilaiMahasiswa.getMahasiswa();
                        MataKuliah mk = nilaiMahasiswa.getMataKuliah();
                        System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMataKuliah(), mk.getSks(), nilaiMahasiswa.getNilai());
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 3:
                    // Cari Nilai Mahasiswa
                    System.out.println("\nDaftar Nilai Mahasiswa:");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    System.out.println("--------------------------------------------------------------");
                    for (Nilai nilaiMahasiswa : daftarNilai) {
                        Mahasiswa mhs = nilaiMahasiswa.getMahasiswa();
                        MataKuliah mk = nilaiMahasiswa.getMataKuliah();
                        System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMataKuliah(), mk.getSks(), nilaiMahasiswa.getNilai());
                    }
                    System.out.println("--------------------------------------------------------------");

                    System.out.print("Masukkan NIM Mahasiswa untuk mencari nilai: ");
                    String cariNim = scanner.nextLine();

                    boolean found = false;
                    for (Nilai nilaiMahasiswa : daftarNilai) {
                        Mahasiswa mhs = nilaiMahasiswa.getMahasiswa();
                        if (mhs.getNim().equals(cariNim)) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println(mhs.toString());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Urut Data Nilai (ascending)
                    Collections.sort(daftarNilai, new Comparator<Nilai>() {
                        @Override
                        public int compare(Nilai nilai1, Nilai nilai2) {
                            // Membandingkan berdasarkan NIM mahasiswa
                            return nilai1.getMahasiswa().getNim().compareTo(nilai2.getMahasiswa().getNim());
                        }
                    });

                    System.out.println("\nDaftar Nilai Mahasiswa setelah diurutkan (ascending):");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    System.out.println("--------------------------------------------------------------");
                    for (Nilai nilaiMahasiswa : daftarNilai) {
                        Mahasiswa mhs = nilaiMahasiswa.getMahasiswa();
                        MataKuliah mk = nilaiMahasiswa.getMataKuliah();
                        System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMataKuliah(), mk.getSks(), nilaiMahasiswa.getNilai());
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 5:
                    // Keluar
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }

        scanner.close();
    }
}
