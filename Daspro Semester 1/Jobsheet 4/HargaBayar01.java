import java.util.Scanner;
public class HargaBayar01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga;
        int jumlah;
        double dis, total, bayar,jmlDis;
        String merkBuku;
        int jmlHalaman;
        int HargaPerHalaman = 250;

        System.out.print("Masukkan nama merk buku yang dibeli : ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku tersebut : ");
        jmlHalaman = input.nextInt();
        System.out.print("Masukkan jumlah buku yang dibeli : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan jumlah diskon :");
        dis = input.nextDouble();

        harga = jmlHalaman * HargaPerHalaman;
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        if (jumlah > 1) {
            System.out.println("Terimakasih telah membeli buku " + merkBuku + " sejumlah " + jumlah);
        }
        else {
            System.out.println("Terimakasih telah membeli buku " + merkBuku);
        }
        System.out.println("Diskon yang anda dapatkan " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah  " + bayar);

        input.close();

        
    }
}

    
