import java.util.Scanner;

public class UcapanTerimakasih_01 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaksih(){
        String nama = PenerimaUcapan();
        System.out.println("Thankyou " +nama+ " for being the best teacher in the world..");
    }
    public static String UcapanTambahan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pesan Tambahan : ");
        String tambahan = input.nextLine();
        input.close();
        return tambahan;
    }
    public static void main(String[] args) {
        String pesan = UcapanTambahan();
        UcapanTerimaksih();
        System.out.println(pesan);
    }
}
