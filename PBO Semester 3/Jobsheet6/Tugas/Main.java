package Jobsheet6.Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen pertama
        Dosen dosen1 = new Dosen("12345", "Budi", "Jalan Merdeka");
        dosen1.setJumlahSKS(12);
        dosen1.setTarif_sks(50000);

        // Membuat objek Dosen kedua
        Dosen dosen2 = new Dosen("67890", "Siti", "Jalan Pancasila");
        dosen2.setJumlahSKS(10);
        dosen2.setTarif_sks(60000);

        // Membuat objek Dosen ketiga
        Dosen dosen3 = new Dosen("54321", "Agus", "Jalan Sudirman");
        dosen3.setJumlahSKS(15);
        dosen3.setTarif_sks(55000);

        // Menghitung gaji masing-masing dosen
        int gajiDosen1 = dosen1.getJumlahSKS() * dosen1.getTarif_sks();
        int gajiDosen2 = dosen2.getJumlahSKS() * dosen2.getTarif_sks();
        int gajiDosen3 = dosen3.getJumlahSKS() * dosen3.getTarif_sks();

        // Menampilkan gaji masing-masing dosen
        System.out.println("Gaji Dosen " + dosen1.getNama() + ": Rp " + gajiDosen1);
        System.out.println("Gaji Dosen " + dosen2.getNama() + ": Rp " + gajiDosen2);
        System.out.println("Gaji Dosen " + dosen3.getNama() + ": Rp " + gajiDosen3);

        // Membuat daftar gaji untuk menyimpan dosen
        DaftarGaji daftarGaji = new DaftarGaji(10);

        // Menambahkan dosen ke dalam daftar gaji
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        daftarGaji.addPegawai(dosen3);

        // Menampilkan data semua dosen yang ada di dalam daftar gaji
        System.out.println("\nDaftar Pegawai:");
        for (int i = 0; i < daftarGaji.listPegawai.length; i++) {
            if (daftarGaji.listPegawai[i] != null) {
                System.out.println("Pegawai ke-" + (i + 1) + ": " + daftarGaji.listPegawai[i].getNama() 
                        + " (NIP: " + daftarGaji.listPegawai[i].getNip() + ", Alamat: " + daftarGaji.listPegawai[i].getAlamat() + ")");
            }
        }
    }
}
