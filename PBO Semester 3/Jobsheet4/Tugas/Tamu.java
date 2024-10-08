package Jobsheet4.Tugas;

public class Tamu {
    private String nama;
    private boolean member; // True jika tamu adalah member, bisa mendapatkan diskon
    
    public Tamu(){}

    public void setNama(String newValue){
        nama = newValue;
    }
    public void setMember(boolean newValue){
        member = newValue;
    }
    public String getNama(){
        return nama;
    }
    public boolean isMember(){
        return member;
    }
    public void info(){
        System.out.println("Nama Tamu: " + nama);
        System.out.println("Member: " + (member ? "Ya" : "Tidak"));
    }
}
