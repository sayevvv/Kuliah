package jobsheet07.TestSearching.P7;

public class PencarianBuku01 {
    Buku01 listBk[] = new Buku01[5];
    int idx;

    void tambah(Buku01 m){
        if(idx < listBk.length){
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Buku01 m : listBk){
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for(int j= 0; j < listBk.length; j++){
            if(listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(int x, int pos){
        if(pos!= -1){
            System.out.println("data " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos) {
        if(pos != -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock  \t : " + listBk[pos].stock);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public Buku01 findBuku(int cari) {
        Buku01 bukuFound = null;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                bukuFound = listBk[i];
                break;
            }
        }
        return bukuFound;
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= right){
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            }else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid);
            } else {
                return FindBinarySearch(cari, mid, right);
            }
        }
        return -1;
    }
}
