public class AirConditioner {
    public String brand;
    public int coldestTemp;

    public void setBrand(String newValue){
        brand = newValue;
    }
    public void setTemp(int newValue){
        coldestTemp = newValue;
    }
    public void cetakInfo(){
        System.out.println("Brand\t\t:" + brand);
        System.out.println("Coldest Temp\t:" + coldestTemp);
    }
}
