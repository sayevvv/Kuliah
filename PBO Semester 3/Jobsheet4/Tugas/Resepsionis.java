package Jobsheet4.Tugas;

public class Resepsionis {
    private String nama;
    
    public Resepsionis(){}

    public void setNama(String newValue){
        nama = newValue;
    }
    public String getNama(){
        return nama;
    }
    public void sambutTamu(String namaTamu) {
        System.out.println("Selamat datang " + namaTamu + ", kami siap melayani Anda!");
    }
    public void info(){
        System.out.println("Nama Resepsionis: " + nama);
    }
}
