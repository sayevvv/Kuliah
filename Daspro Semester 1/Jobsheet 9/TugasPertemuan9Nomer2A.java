import java.util.Scanner;

public class TugasPertemuan9Nomer2A {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [] bil = new int[60];
        for (int i = 0; i < bil.length; i++) {
            System.out.print("Input array ke-" +(i+1) + " : ");
            bil [i] = Sc.nextInt();
        }
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bilangan ke-" + (i+1) + " adalah = " + bil[i]);
        } Sc.close();
    }
}