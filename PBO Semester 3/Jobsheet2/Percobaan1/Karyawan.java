package Jobsheet2.Percobaan1;

public class Karyawan {
    String nama, jenisKelamin, jabatan;
    double gaji;

    public Karyawan(String namaNew, String kelaminNew, String jabatanNew, double gajiNew){
        nama = namaNew;
        jenisKelamin = kelaminNew;
        jabatan = jabatanNew;
        gaji = gajiNew;
    }
    
    public void tampilDataDiri(){
        System.out.println("nama\t: " + nama);
        System.out.println("gender\t: " + jenisKelamin);
        System.out.println("jabatan\t: " + jabatan);
    }
    public void tampilGaji(){
        System.out.println("gaji\t: " + gaji);
    }
}
