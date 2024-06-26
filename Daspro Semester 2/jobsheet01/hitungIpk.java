package jobsheet01;
import java.util.Scanner;
public class hitungIpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matkul = {"Pancasila", "KTI", "CTPS", "Matdas", "Bing", "Daspro", "Prakdaspro", "K3"};
        int[] nilaiAngka = new int[matkul.length];

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        for(int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
            nilaiAngka[i] = sc.nextInt();
        }
        // double ipSemester = 0.0;
        // for (int i = 0; i < matkul.length; i++) {
        //     ipSemester += nilaiAngka[i] * 4;
        // }
        // ipSemester /= matkul.length;

        // Menentukan nilai huruf dan nilai setara untuk setiap mata kuliah
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];
        for (int i = 0; i < matkul.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        double ipSemester = 0.0;
        for(int i = 0; i < matkul.length; i++) {
            ipSemester =+ nilaiSetara[i];
        }

        // Menampilkan tabel nilai
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| Mata Kuliah | Nilai Angka | Nilai Huruf | Bobot Nilai |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("| %-20s | %10d | %10s | %10.2f |\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("IP Semester: " + ipSemester);

    }
    }
