import java.util.Scanner;
public class TugasNo2 {

        //fungsi input data nilai mahasiswa
        private static final int jmlhMinggu = 7;
        private static final int jmlhMahasiswa = 5;
        private static final String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        private static final int[][] nilaiMahasiswa = {
            { 20, 19, 25, 20, 10, 0, 10 },
            { 30, 30, 40, 10, 15, 20, 25 },
            { 5, 0, 20, 25, 10, 5, 45 },
            { 50, 0, 7, 8, 0, 30, 60 },
            { 15, 10, 16, 15, 10, 10, 5 }
        };
      
            Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
          // Menampilkan semua nilai
          tampilkanSemuaNilai();
      
          // Menampilkan nilai tertinggi dari semua mahasiswa di setiap minggu
          int HariTertinggi = cariHariNilaiTertinggi();
          System.out.println("Hari dengan nilai tertinggi adalah hari ke-" + HariTertinggi);


          // Menampilkan mahasiswa dengan nilai tertinggi
          tampilkanMahasiswaNilaiTertinggi();
        }
      

        private static void tampilkanSemuaNilai() {
          
          System.out.println("b.Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama \r\n" + //
                  "sampai ketujuh");
                  System.out.println ("----------------------------------------------------");
          System.out.printf("\n%-8s", "Nama");
          for (int i = 1; i <= nilaiMahasiswa[0].length; i++) {
              System.out.printf("%-6s", "M - " + i);
          }
          System.out.println();
  
          for (int i = 0; i < namaMahasiswa.length; i++) {
              System.out.printf("%-8s", namaMahasiswa[i]);
              for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                  System.out.printf("%-6d", nilaiMahasiswa[i][j]);
              }
              System.out.println();
      
            }
        }

       
        public static int cariHariNilaiTertinggi() {
            int hariMax = 0;
            int nilaiMax = Integer.MIN_VALUE;
    
            System.out.println("\n\n\nc. Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding \r\n" + //
                    "hari lain dari keseluruhan mahasiswa");
                    System.out.println ("----------------------------------------------------");
            for (int hari = 0; hari < jmlhMinggu; hari++) {
                int totalNilaiHari = 0;
                for (int mhs = 0; mhs < jmlhMahasiswa; mhs++) {
                    totalNilaiHari += nilaiMahasiswa[mhs][hari];
                }
    
                if (totalNilaiHari > nilaiMax) {
                    nilaiMax = totalNilaiHari;
                    hariMax = hari;
                }
            }
    
            return hariMax + 1; // Tambah 1 karena indeks dimulai dari 0
        }
    
      
      
        public static void tampilkanMahasiswaNilaiTertinggi() {
            int mahasiswaTertinggi = -1;
            int nilaiTertinggi = Integer.MIN_VALUE;
    
            for (int mhs = 0; mhs < jmlhMahasiswa; mhs++) {
                int totalNilaiMhs = 0;
                for (int hari = 0; hari < jmlhMinggu; hari++) {
                    totalNilaiMhs += nilaiMahasiswa[mhs][hari];
                }
    
                if (totalNilaiMhs > nilaiTertinggi) {
                    nilaiTertinggi = totalNilaiMhs;
                    mahasiswaTertinggi = mhs;
                }
            }
            System.out.println("\n\n\nd. Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi (tampilkan \r\n" + //
                    "pula keterangan nilai dari minggu ke-)");
             System.out.println ("----------------------------------------------------");
            
            // Menampilkan mahasiswa dengan nilai tertinggi
            System.out.println("Mahasiswa dengan nilai tertinggi adalah: " + namaMahasiswa[mahasiswaTertinggi]);
    
            // Menampilkan keterangan nilai per minggu untuk mahasiswa tertinggi
            System.out.println("Keterangan nilai per minggu untuk mahasiswa tertinggi bernama " + namaMahasiswa[mahasiswaTertinggi] + " : " );
            for (int hari = 0; hari < jmlhMinggu; hari++) {
                System.out.println("\nMinggu ke-" + (hari + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][hari]);
            }
        }
      
}