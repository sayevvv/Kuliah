package jobsheetGraph.tugas;

public class Node {
    int data;
    Node prev;
    Node next;
    int jarak;

    Node(Node prev, int data, int jarak, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}
