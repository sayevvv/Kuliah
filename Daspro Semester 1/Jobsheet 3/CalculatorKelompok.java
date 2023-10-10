import java.util.Scanner;
public class CalculatorKelompok {
    public static void main(String[] args) {
        Scanner Cc = new Scanner(System.in);
        System.out.println("SIMPLE CALCULATOR");
        System.out.println("Choose an operation : ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (*)");

        int input = Cc.nextInt();
        double result = 0;

        System.out.println("Enter The First Number : ");
        double Num1 = Cc.nextDouble();

        System.out.println("Enter The Second Number : ");
        double Num2 = Cc.nextDouble();

        switch (input) {
            case 1:
            result = Num1 + Num2;
            break;
            case 2:
            result = Num1 - Num2;
            break;
            case 3:
            result = Num1 * Num2;
            break;
            case 4:
            if ( Num2 != 0 ) {
                result = Num1 / Num2;
            } else {
                System.out.println("Error");
                System.exit(1);
            }
            break;
        default:
            System.out.println("INVALID CHOICE");
            System.exit(1);
        }
        System.out.println("Result : " + result);

        Cc.close();
}
}