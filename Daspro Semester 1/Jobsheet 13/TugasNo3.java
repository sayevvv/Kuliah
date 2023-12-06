import java.util.Scanner;

public class TugasNo3 {

    private static String[] namaMahasiswa;
    private static int[][] nilaiMahasiswa;
    private static int jumlahMinggu;
    private static int jumlahMahasiswa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan jumlah minggu
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        jumlahMinggu = scanner.nextInt();

        // Inisialisasi array berdasarkan input
        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        // Input nama dan nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan semua nilai
        tampilkanSemuaNilai();

        // Menampilkan nilai tertinggi dari semua mahasiswa di setiap minggu
        tampilkanNilaiTertinggiPerMinggu();

        // Menampilkan mahasiswa dengan nilai tertinggi
        tampilkanMahasiswaDenganNilaiTertinggi();

        scanner.close();
    }

    private static void tampilkanSemuaNilai() {
        System.out.println("\nSemua Nilai:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void tampilkanNilaiTertinggiPerMinggu() {
        System.out.println("\nNilai Tertinggi per Minggu:");
        for (int minggu = 0; minggu < jumlahMinggu; minggu++) {
            int nilaiTertinggi = 0;
            for (int mahasiswa = 0; mahasiswa < jumlahMahasiswa; mahasiswa++) {
                if (nilaiMahasiswa[mahasiswa][minggu] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[mahasiswa][minggu];
                }
            }
            System.out.println("Minggu " + (minggu + 1) + ": " + nilaiTertinggi);
        }
    }

    private static void tampilkanMahasiswaDenganNilaiTertinggi() {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi:");
        int nilaiTertinggi = 0;
        String namaMahasiswaTertinggi = "";
        for (int mahasiswa = 0; mahasiswa < jumlahMahasiswa; mahasiswa++) {
            int totalNilai = 0;
            for (int minggu = 0; minggu < jumlahMinggu; minggu++) {
                totalNilai += nilaiMahasiswa[mahasiswa][minggu];
            }
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                namaMahasiswaTertinggi = namaMahasiswa[mahasiswa];
            }
        }
        System.out.println(namaMahasiswaTertinggi + " dengan total nilai " + nilaiTertinggi);
    }
}