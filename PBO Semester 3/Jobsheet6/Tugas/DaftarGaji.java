package Jobsheet6.Tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;
    int index; 

    public DaftarGaji(int x) {
        listPegawai = new Pegawai[x];
        index = 0; 
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p; 
            index++; 
        } else {
            System.out.println("Array is full, cannot add more Pegawai.");
        }
    }
}

