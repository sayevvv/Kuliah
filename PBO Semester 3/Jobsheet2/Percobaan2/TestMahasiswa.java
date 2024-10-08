package Jobsheet2.Percobaan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Shamil";
        mhs1.alamat="Jl. Kembang Turi No 4";
        mhs1.kelas="2D";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Rina";
        mhs2.alamat = "Jl. Mawar No 5";
        mhs2.kelas = "3A";
        mhs2.tampilBiodata();


        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Budi";
        mhs3.alamat = "Jl. Melati No 6";
        mhs3.kelas = "1B";
        mhs3.tampilBiodata();
    }
}
