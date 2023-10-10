import java.util.Scanner;

public class TugasIndividuFPS {

    public static void main(String[] args) {
        
    Scanner Sc = new Scanner(System.in);
    System.out.print("Masukkan jarak : ");
    double jarak = Sc.nextDouble();

    if (jarak >= 5) {
        System.out.println("Pilih senjata ranged");
    }
    else {
        System.out.println("Pilih senjata melee");
    }
    Sc.close();
}
}
