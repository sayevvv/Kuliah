import java.util.Scanner;

public class Ucapan_01 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        System.out.println(namaOrang);
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        System.out.println("Thankyou " +PenerimaUcapan()+ "\nMay be the force be with you");
    }
}
