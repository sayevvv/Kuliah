import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next, nama;
        int kolom, baris;

        String [][] penonton = new String[4][2];
        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris > 4 || baris < 1 || kolom < 1 || kolom > 2) {
                System.out.println("Input kursi salah");
                continue;
            }
            if (penonton[baris-1][kolom -1] == null) {
                penonton[baris-1][kolom -1] = nama;
            } else {
                System.out.println("Mohon maaf kursi sudah terpenuhi, silahkan isi lagi");
                continue;
            }
            for (int i = 0; i < penonton.length; i ++) {
                System.out.print("Baris ke-" + (i + 1) + " : " );
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***");
                    } else {
                        System.out.print(penonton[i][j]);
                    }
                    if (j < penonton[i].length - 1) {
                        System.out.println(", ");
                    }
            }
           System.out.println();
        }    
        System.out.println("Input nama penonton lainnya? (y/n)");  
        next = sc.nextLine();
        
        if (next.equalsIgnoreCase("n")) {
            break;
        }
        }
        sc.close();
    }
}

