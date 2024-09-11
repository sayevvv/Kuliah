public class Mobil {
    public String brand;
    public int horsepower;

    public void setBrand(String newValue){
        brand = newValue;
    }
    public void setHorsePower(int newValue){
        horsepower = newValue;
    }
    public void cetakInfo(){
        System.out.println("Brand\t\t:" + brand);
        System.out.println("Horsepower\t:" + horsepower);
    }

}


