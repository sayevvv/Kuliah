import java.util.Scanner;
public class TugasIndividuAkar {
    public static void main(String[] args) {
        int a, b, c, D, x1, x2;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input nilai variabel a : ");
        a = Sc.nextInt();
        System.out.print("Input nilai variabel b : ");
        b = Sc.nextInt();
        System.out.print("Input nilai variabel c : ");
        c = Sc.nextInt();

        D = (b * b) - 4*a*c;

        if (a == 0 ) {
            x1 = b /= -c;
            System.out.println("Nilai dari x adalah : " +x1);
        }
        else {
            if (D > 0) {
                x1 = -b/(2*a) + ((D ^= 2)/(2*a));
                x2 = -b/(2*a) - ((D ^= 2)/(2*a));

                System.out.println("Nilai dari x1 adalah : " +x1);
                System.out.println("Nilai dari x2 adalah : " +x2);
            }
            else {
                System.out.println("Bilangan Imajiner");
            }
        }
        Sc.close();
    }
}
