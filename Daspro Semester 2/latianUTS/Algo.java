package latianUTS;

public class Algo {
    int panjangdata;
    Prog[] listData;
    public Algo(int pd){
        if(pd <= 0) {
            System.out.println("harus positif !");
        }
        panjangdata = pd;
        listData = new Prog[panjangdata];
    }
    
    int idx = 0;
    
    void tambah(Prog m){
        System.out.println(listData.length);
        if(idx < listData.length){
            listData[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        System.out.println("-------------");
        for(int i = 0; i < idx; i++){ // Loop until idx, not listData.length
            listData[i].tampil();
            System.out.println("------------");
        }
    }
    void insertionSort(){
        for(int i = 1; i < listData.length; i++) {
            Prog temp = listData[i];
            int j = 1;
            while(j > 0 && listData[j - 1].balance > temp.balance) {
                listData[j] = listData[j - 1];
                j--;
            }
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listData.length - 1; i++) {
            for (int j = 1; j < listData.length; j++) {
                if (listData[j].balance < listData[j - 1].balance) { 
                    Prog tmp = listData[j];
                    listData[j] = listData[j - 1];
                    listData[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<listData.length-1;i++){
            int idxMin = i;
            for(int j = i+1; j<listData.length; j++){
                if(listData[j].balance > listData[idxMin].balance){
                    idxMin = j;
                }
            }
            Prog tmp = listData[idxMin];
            listData[idxMin] = listData[i];
            listData[i] = tmp;
        }
    }
    public int FindSeqSearchStr(String cari) {
        int posisi = -1;
        for (int j = 0; j < listData.length; j++) {
        if (listData[j].name.equals(cari)) {
            posisi = j;
            break;
        }
        }
        return posisi;
    }
    public int FindBinarySearchJudul(String cari, int left, int right) {
        while (right >= left) {
        int mid = (right + left) / 2;
        if (cari.toLowerCase().compareTo(listData[mid].name.toLowerCase()) == 0) {
            return mid;
        }
        if (listData[left].name.toLowerCase().compareTo(cari.toLowerCase()) <= 0 && cari.toLowerCase().compareTo(listData[mid].name.toLowerCase()) <= 0) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        }
        return -1;
    }
    // public int FindBinarySearchKode(String cari, int left, int right) {
    //     while (right >= left) {
    //     int mid = (right + left) / 2;
    //     if (cari.toLowerCase().compareTo(listData[mid].name.toLowerCase()) == 0) {
    //         return mid;
    //     }
    //     if (listData[left].name.toLowerCase().compareTo(cari.toLowerCase()) <= 0 && cari.toLowerCase().compareTo(listData[mid].name.toLowerCase()) <= 0) {
    //         right = mid - 1;
    //     } else {
    //         left = mid + 1;
    //     }
    //     }
    //     return -1;
    // }
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
        if (listData[i].name.toLowerCase().contains(u.toLowerCase())) {
            totalDitemukan++;
            System.out.println("================================");
            System.out.println("Nomor Akun :" + listData[i].accountNumber);
            System.out.println("Nama Akun :" + listData[i].name);
            System.out.println("Nomor Telefon :" + listData[i].phone);
            System.out.println("Email :" + listData[i].email);
            System.out.println("Saldo:" + listData[i].balance);
        }
        }
        if (totalDitemukan > 1) {
        System.out.println("Peringatan: Ditemukan " + totalDitemukan + " nama akun yang mengandung \"" +  u + "\".");
        } else if (totalDitemukan == 0) {
        System.out.println("Data tidak ditemukan");
        }
    }
    // public void TampilDataKode(String u) {
    //     for (int i = 0; i < listData.length; i++) {
    //     if (listData[i].name.toLowerCase().contains(u.toLowerCase())) {
    //         System.out.println("================================");
    //         System.out.println("Nomor Akun :" + listData[i].accountNumber);
    //         System.out.println("Nama Akun :" + listData[i].name);
    //         System.out.println("Nomor Telefon :" + listData[i].phone);
    //         System.out.println("Email :" + listData[i].email);
    //         System.out.println("Saldo :" + listData[i].balance);
    //     }
    //     }
        
    // }
    
}
