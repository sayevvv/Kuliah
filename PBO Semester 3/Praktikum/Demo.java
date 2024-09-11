public class Demo {
    public static void main(String[] args) {
        Mobil mb1 = new Mobil();
        MobilListrik mb2 = new MobilListrik();
        MobilDiesel mb3 = new MobilDiesel();
        Laptop lp = new Laptop();
        AirConditioner ac = new AirConditioner();

        //Mobil;
        mb1.setBrand("Lamborghini");
        mb1.setHorsePower(2000);
        
        //Mobil Listrik
        mb2.setBrand("Tesla");
        mb2.setHorsePower(1500);
        mb2.spekBaterai(575);
        
        //Mobil Diesel
        mb3.setBrand("Ford");
        mb3.setHorsePower(1800);
        mb3.spekTurbo("Ecodiesel");

        //Laptop
        lp.setBrand("Asus");
        lp.setKeySize(100);

        //Air Conditioner
        ac.setBrand("Sony");
        ac.setTemp(14);

        System.out.println("=== Mobil ===");
        mb1.cetakInfo();
        System.out.println();
        System.out.println("=== Mobil Listrik ===");
        mb2.cetakInfo();
        System.out.println();
        System.out.println("=== Mobil Diesel ===");
        mb3.cetakInfo();
        System.out.println();
        System.out.println("=== Laptop ===");
        lp.cetakInfo();
        System.out.println();
        System.out.println("=== Air Conditioner ===");
        ac.cetakInfo();
        System.out.println();
    }
}
