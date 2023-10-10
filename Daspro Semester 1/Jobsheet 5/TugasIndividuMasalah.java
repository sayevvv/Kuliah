import java.util.Scanner;

public class TugasIndividuMasalah {
    public static void main(String[] args) {

        double Kecepatan;
        
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input Kecepatan : ");
        Kecepatan = Sc.nextDouble();

        String BatasHemat = (Kecepatan > 80.0) ?  "Kamu melaju terlalu cepat, Hemat bensin !" : "Kecepatanmu pas, jangan terlalu cepat, jangan boros bensin !";
        System.out.println(BatasHemat);
        Sc.close();
    }
}