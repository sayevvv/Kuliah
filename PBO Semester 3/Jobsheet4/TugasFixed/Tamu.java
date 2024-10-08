package Jobsheet4.TugasFixed;

public class Tamu extends Orang{
    private boolean member; // True jika tamu adalah member

    public Tamu() {}

    public void setMember(boolean newValue) {
        member = newValue;
    }

    public boolean isMember() {
        return member;
    }

    // Override method info untuk menampilkan informasi tambahan
    @Override
    public void info() {
        super.info();  // Memanggil method info() dari Orang
        System.out.println("Member: " + (member ? "Ya" : "Tidak"));
    }
}
