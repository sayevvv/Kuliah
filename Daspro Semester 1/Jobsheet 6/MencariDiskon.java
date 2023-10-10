import java.util.Scanner;

public class MencariDiskon {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        double TotalDiskon = 0.0;
        String Jenis;
        int Jumlah;
        System.out.print("Input Jenis Buku : ");
        Jenis = input01.nextLine();
        System.out.print("Input Jumlah yang dibeli : ");
        Jumlah = input01.nextInt();

        if (Jenis.equalsIgnoreCase("kamus") || Jenis.equalsIgnoreCase("novel")) {
            if (Jenis.equalsIgnoreCase("kamus")) {
                TotalDiskon += 10;
                if (Jumlah > 2) {
                    TotalDiskon += 2; 
                } 
            } else {
                TotalDiskon += 7;
                if (Jumlah > 3) {
                    TotalDiskon += 2;
                } else {
                    TotalDiskon += 1;
                }
            } 
        } else {
            if(Jumlah > 3) {
                TotalDiskon += 5;
            } 
            }
            System.out.println("Total Diskon Yang Anda Dapatkan : " + TotalDiskon + "%");
            input01.close();
        }

    }

