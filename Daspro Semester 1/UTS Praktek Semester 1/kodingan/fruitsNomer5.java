import java.util.Scanner;

public class fruitsNomer5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String[] fruit = {"Mango ", "Apple ", "Grapes", "Exit  "};
        int[] price = {5, 3, 2, 0};
        int [] cart = new int[fruit.length];
        int totalCost = 0;
        
        System.out.println("==== Fruits Menu ===");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println((i+1) + " " + fruit[i] + "\t$" + price[i]);
        }
        while (true) {
            System.out.print("Input wich fruit number you want to buy (exit '4' to stop):");
            int choice = Sc.nextInt();
            if (choice == 4) {
                break;
            } 
            if (choice < 1 || choice > fruit.length) {
                System.out.println("Invalid");
                continue;
            }
            int index = choice-1;
            cart[index]++;
            System.out.println("You have bought");
            System.out.println("Fruits\t\tCost per Pound.(in$)");
            System.out.println(fruit[index] + "\t\t $" + price[index]); 

            totalCost += price[index];
        }
        System.out.println("Total Cost : $" + totalCost );
        Sc.close();
    }
}