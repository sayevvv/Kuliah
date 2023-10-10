public class ContohVariabel01 {
    public static void main(String[] args) {
        String Hobby = "Bermain petak umpet";
        boolean Pandai = true;
        char Kelamin = 'L';
        byte Umur = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(Hobby);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin: " + Kelamin);
        System.out.println("Umurku saat ini: " + Umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}