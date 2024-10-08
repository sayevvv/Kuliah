package Jobsheet4.Percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    // Constructor to accept seat number as String
    public Kursi(String nomor) {
        this.nomor = nomor;
        this.penumpang = null; // Initially, no passenger on the seat
    }

    // Getter for seat number
    public String getNomor() {
        return nomor;
    }

    // Setter for seat number (optional, since the constructor already sets it)
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    // Setter for passenger
    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        } else {
            info += "Kursi kosong\n";
        }
        return info;
    }
    public Penumpang getPenumpang() {
        return this.penumpang;
    }
    
}
