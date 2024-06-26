package jobsheet11.tugas;

public class Node {
    int nomorData;
    String data;
    Node prev, next;

    Node(Node prev, String data, Node next, int nomorData){
        this.prev=prev;
        this.data=data;
        this.next=next;
        this.nomorData=nomorData;
    }
}
