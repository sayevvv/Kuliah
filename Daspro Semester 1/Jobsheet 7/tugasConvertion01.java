import java.util.Scanner;

public class tugasConvertion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenis;
        double jumlah = 0, jumlahSetelah;

        System.out.print("Input jenis : ");
        jenis = sc.nextLine();
        System.out.print("Input Jumlah : ");
        jumlah = sc.nextInt();
        jumlahSetelah = jumlah;
        if (jenis.equalsIgnoreCase("pounds") ) {
            jumlahSetelah *= 1.22;
        } else if (jenis.equalsIgnoreCase("francs")){
            jumlahSetelah *= 1.11;
        } else if(jenis.equalsIgnoreCase("marks")) {
            jumlahSetelah *= 0.54;
        } else if (jenis.equalsIgnoreCase("lire") ) {
            jumlahSetelah *= 0.036;
        } else {
            System.out.println("Salah input jenis");
            System.exit(0);
        }

        System.out.println(jumlah + " " + jenis + " is now " + jumlahSetelah + " dollars");
        

    }
}
