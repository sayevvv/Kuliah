public class MobilListrik extends Mobil{
    public int baterai;

    public void spekBaterai(int newValue){
        baterai = newValue;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Baterai\t\t:" + baterai);
    }
}
