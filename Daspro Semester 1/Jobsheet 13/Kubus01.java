import java.util.Scanner;
public class kubus01 {
    static int volume (int s) {
        int volume = s*s*s;
        return volume;
    }
    static int luaspermukaan (int s){
        int permukaan = s*s*6;
        return permukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sisi");
        int sisi,volume,luaspermukaan;
        sisi = sc.nextInt();

        volume = volume(sisi);
        System.out.println("volume kubus :" + volume);
        luaspermukaan = luaspermukaan(sisi);
        System.out.println("Luas permukaan : " + luaspermukaan);
        
    }
}

