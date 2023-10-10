import java.util.Scanner;
public class TugasIndividuSystem {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String  inputUser, inputPass;
        
        System.out.print("Masukkan Username : ");
        inputUser = Sc.nextLine();
        System.out.print("Masukkan Password : ");
        inputPass = Sc.nextLine();

        if (inputUser.equals("Admin") && inputPass.equals("123")) {
            System.out.println("Username dan Password benar");
        } else {
            System.out.println("Username dan Password anda harus benar !");
        }
       Sc.close();
    }
}