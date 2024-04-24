package UTS;

public class StokAlgo {
    int panjangdata;
    Stok[] listData;
    public StokAlgo(int kp) {
        if(kp <= 0){
            System.out.println("harus positif");
        }
        panjangdata = kp;
        listData = new Stok[panjangdata];
    }

    int idx = 0;

    void tambah(Stok m){
        if(idx < listData.length){
            listData[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        System.out.println("-------------");
        for(int i = 0; i < idx; i++){
            listData[i].tampil();
            System.out.println("------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listData.length - 1; i++) {
            for (int j = 1; j < listData.length; j++) {
                if (listData[j].stok < listData[j - 1].stok) { 
                    Stok tmp = listData[j];
                    listData[j] = listData[j - 1];
                    listData[j - 1] = tmp;
                }
            }
        }
    }
    public int FindBinarySearchNama(String cari, int left, int right) {
        while (right >= left) {
        int mid = (right + left) / 2;
        if (cari.toLowerCase().compareTo(listData[mid].nama.toLowerCase()) == 0) {
            return mid;
        }
        if (listData[left].nama.toLowerCase().compareTo(cari.toLowerCase()) <= 0 && cari.toLowerCase().compareTo(listData[mid].nama.toLowerCase()) <= 0) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        }
        return -1;
    }
    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
        System.out.println("data : " + x + " ditemukan pada indeks " + pos + ", data ke " + (pos + 1));
        } else {
        System.out.println("data : " + x + " tidak ditemukan");
        }
    }


    public void TampilDataKetemu(String u) {
    int totalDitemukan = 0;
    for (int i = 0; i < listData.length; i++) {
    if (listData[i].kategori.toLowerCase().contains(u.toLowerCase()) && listData[i].stok == 0) {
        totalDitemukan++;
        System.out.println("================================");
        System.out.println("Kode barang :" + listData[i].kodeBarang);
        System.out.println("Nama Akun :" + listData[i].nama);
        System.out.println("Kategori :" + listData[i].kategori);
        System.out.println("Harga Satuan :" + listData[i].hargaSatuan);
        System.out.println("Stok:" + listData[i].stok);
    }
    }
    if (totalDitemukan > 1) {
    System.out.println("Peringatan: Ditemukan " + totalDitemukan + " barang yang berkategori makanan memiliki jumlah stok kosong");
    } else if (totalDitemukan == 0) {
    System.out.println("Tidak ada barang berkategori makanan dengan stok kosong");
    }
}
}
