public class MobilDiesel extends Mobil{
    public String turboCharge;
    
    public void spekTurbo(String newValue){
        turboCharge = newValue;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Turbocharge\t:" + turboCharge);
    }
}