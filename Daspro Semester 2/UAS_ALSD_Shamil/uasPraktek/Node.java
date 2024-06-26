package UAS_ALSD_Shamil.uasPraktek;

public class Node {
    BarangRental data;
    Node prev, next;

    Node(Node prev, BarangRental data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}


