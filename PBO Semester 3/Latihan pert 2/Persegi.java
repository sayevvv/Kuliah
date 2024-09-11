public class Persegi {
    public int sisi;

    public Persegi(int newValue){
        sisi = newValue;
    }
    public void tampilPanjang() {
        System.out.println("Sisi persegi\t\t: " + sisi);
    }
    public void hitungLuas() {
        System.out.println("Luas Persegi\t\t: " + sisi * sisi);
    }
    public void hitungKeliling() {
        System.out.println("Keliling Persegi\t: " + 4 * sisi);
    }
}