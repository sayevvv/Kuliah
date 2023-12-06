import java.util.Scanner;

public class nilaiRaport01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double nilaiFis, nilaiMat, nilaiBing, nilaiBin, rata2, rata2Bahasa;
        String jurusan;
        int jurusanPilihan, jumlahSiswa;

        System.out.print("Input jumlah siswa : ");
        jumlahSiswa = Sc.nextInt();

        for (int z = 0; z < jumlahSiswa; z ++) {
        
        System.out.println("===== DATA NILAI SISWA KE-" +(z+1)+ " ====");
        System.out.println(" ");
        System.out.print("Input nilai Matematika: ");
        nilaiMat = Sc.nextDouble();
        System.out.print("Input nilai Fisika: ");
        nilaiFis = Sc.nextDouble();
        System.out.print("Input nilai Bahasa Inggris: ");
        nilaiBing = Sc.nextDouble();
        System.out.print("Input nilai Bahasa Indonesia: ");
        nilaiBin = Sc.nextDouble();

        rata2 = (nilaiMat + nilaiFis + nilaiBing + nilaiBin ) / 4;
        System.out.println("Nilai rata rata mu: " + rata2);

        System.out.println("Pilih jurusan berikut : ");
        System.out.println("1. D4 TI");
        System.out.println("2. D3 MI");
        System.out.print("Jurusan Pilihan? (1 / 2) ");
        jurusanPilihan = Sc.nextInt();

        System.out.print("Asal Jurusan: ");
        jurusan = Sc.next();
        
        if (jurusanPilihan == 1) {
            if (jurusan.equalsIgnoreCase("ipa") || jurusan.equalsIgnoreCase("ips")) {
                if (nilaiMat >= 80 && rata2 >= 80) {
                    System.out.println("Selamat, siswa ke " + (z+1) + "diterima di Program Studi D4 TI");
                }else {
                    System.out.println("Mohon maaf, nilai tidak mencukupi untuk masuk D4 TI");
                }
            } else {
                System.out.println("Mohon maaf, jurusan asal tidak bisa masuk D4 TI");
            }
        } else if (jurusanPilihan == 2) {
            if(jurusan.equalsIgnoreCase("ipa")) {
                if (nilaiMat >= 70 && nilaiFis >= 70) {
                    System.out.println("Selamat, siswa ke " + (z+1) +  " diterima di Program Studi D3 MI");
                } else {
                    System.out.println("Mohon maaf, nilai tidak mencukupi untuk masuk di D3 MI");
                }
            } else  if(jurusan.equalsIgnoreCase("bahasa")) {
                rata2Bahasa = (nilaiFis + nilaiBin + nilaiBing) / 3;
                if (rata2Bahasa > 80 && nilaiBin >= 70 && nilaiFis >= 70 && nilaiBing >= 70) {
                    System.out.println("Selamat, siswa ke" + (z+1) + "diterima di Program Studi D3 MI");
                } else {
                    System.out.println("Mohon maaf kamu tidak diterima di jurusan D3 MI");
                }
            } else {
                System.out.println("Mohon maaf, jurusan asal tidak bisa masuk D3 MI");
            }
        } else {
            System.out.println("Hanya ada opsi 1 dan 2, input salah");
        }
    } Sc.close();
    }
}