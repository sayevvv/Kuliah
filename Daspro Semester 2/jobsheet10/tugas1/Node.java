package jobsheet10.tugas1;

public class Node {
    MahasiswaSLL data;
    Node next;

    Node(){
    }
    
    Node(MahasiswaSLL mhs){
        data = mhs;
        next = null;
    }
}
