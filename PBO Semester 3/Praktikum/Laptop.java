public class Laptop {
    public String brand;
    public int keyboardSize;

    public void setBrand(String newValue){
        brand = newValue;
    }
    public void setKeySize(int newValue){
        keyboardSize = newValue;
    }
    public void cetakInfo(){
        System.out.println("Brand\t\t:" + brand);
        System.out.println("Keyboard Size \t:" + keyboardSize);
    }
}
