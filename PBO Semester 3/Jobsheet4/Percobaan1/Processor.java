package Jobsheet4.Percobaan1;

public class Processor {
    private String merk;
    private double cache;

    public Processor(){

    }
    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
    public String getMerk(){
        return merk;
    }
    public double getCache(){
        return cache;
    }
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setCache(double newValue){
        cache = newValue;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
