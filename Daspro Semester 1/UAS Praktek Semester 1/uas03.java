import java.util.Scanner;

public class uas03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        int specialCharacters = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Jumlah huruf vokal: " + vowels);
        System.out.println("Jumlah huruf konsonan: " + consonants);
        System.out.println("Jumlah karakter special: " + specialCharacters);

        scanner.close();
    }
}