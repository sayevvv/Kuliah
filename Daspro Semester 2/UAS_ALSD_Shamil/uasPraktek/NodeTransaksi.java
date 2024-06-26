package UAS_ALSD_Shamil.uasPraktek;

public class NodeTransaksi {
    TransaksiRental data;
    Node prev, next;

    NodeTransaksi(Node prev, TransaksiRental data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}
// Untuk Menunjukkan Riwayat Transaksi NOmer 4 tetapi belum selesai