import java.util.Scanner;

public class ModulKelompok {
    public static void main(String[] args) {
        int MCW, MWE, tot;
        String Result;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Input Course Work Grade (MCW) : ");
        MCW = Sc.nextInt();
        System.out.print("Input Written Exam Grade (MWE) : ");
        MWE = Sc.nextInt();
        
        tot = MCW + MWE;

        if (MCW > 20) {
            if (MWE > 20) {
                if (tot > 45) {
                    Result = "PASS";
                } else if (tot == 44) {
                    tot = 45;
                    Result = "PASS";
                } else {
                    Result = "FAIL";
                }
            } else if (tot == 45) {
                tot = 44;
                Result = "Technical Fail";
            } else {
                Result = "FAIL";
            }
        } else if (MWE > 20) {
            if (tot > 45) {
                tot = 44;
                Result = "Technical Fail";
            } else {
                Result = "FAIL";
            }
        } else {
            Result = "FAIL";
        } 
        System.out.println("Total : " + tot);
        System.out.println("Result : " + Result);
Sc.close();
}

}