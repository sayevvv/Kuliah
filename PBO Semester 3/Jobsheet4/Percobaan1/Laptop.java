package Jobsheet4.Percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }
    
    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setProc(Processor newproc){
        proc = newproc;
    }
    public String getMerk(){
        return merk;
    }
    public Processor getProc(){
        return proc;
    }
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
