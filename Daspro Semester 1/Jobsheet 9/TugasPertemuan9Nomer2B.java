import java.util.Scanner;

public class TugasPertemuan9Nomer2B {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [] bil = new int[10];
        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            bil[i] = Sc.nextInt();
        }
        for (int i = 9; i > -1 ; i--) {
            System.out.println(bil[i]);
        } Sc.close();
    }
}
