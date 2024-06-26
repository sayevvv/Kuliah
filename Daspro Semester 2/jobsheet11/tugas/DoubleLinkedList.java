package jobsheet11.tugas;

public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList () {
        head = null;
        size=0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst (String item, int nomorData) {
        if (isEmpty()) {
            head = new Node(null, item, null, nomorData);
        }else {
            Node newNode = new Node(null, item, head, nomorData);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(String item, int nomorData) {
        if (isEmpty()) {
            addFirst(item, nomorData);
        }else { 
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null, nomorData);
            current.next = newNode;
            size++;
        }
    }

    public void add (String item, int index, int nomorData) throws Exception {
        if (isEmpty()) {
            addFirst(item, nomorData);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i =0;
            while (i< index) {
                current=current.next;
                i++;
            }
        if (current.prev == null){
            Node newNode = new Node(null, item, current, nomorData);
            current.prev = newNode;
            head = newNode;
        } else {
            Node newNode = new Node(current.prev, item, current, nomorData);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }
    size++;
}
public int size(){
    return size;
}

public void clear () {
    head = null;
    size =0;
}

public void print() {
    if (!isEmpty()) {
        Node tmp = head;
        int count = 0;
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println(("++++++++++++++++++++++++"));
        System.out.println("| " + " NO " + "| " + " NAMA ");
        while (tmp != null) {
            System.out.println("| " + tmp.nomorData + " | " + tmp.data);
            tmp = tmp.next;
            count++;
        }
        System.out.println("Sisa Antrian : " + count);
    } else {
        System.out.println("Linked List Kosong");
    }
}

public void removeFirst ()  throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
    } else if (size ==1) {
        System.out.println(head.data + " telah selesai divaksinasi");
        removeLast();
    }else {
        System.out.println(head.data + " telah selesai divaksinasi");
        head = head.next;
        head.prev = null;
        size--;
    }
}

public void removeLast () throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong tidak dapat dihapus!");
    } else if (head.next == null) {
        head = null;
        size --;
        return;
    } 
    Node current = head;
    while (current.next.next != null) {
        current= current.next;
    }
    current.next = null;
    size--;
    }

    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index ==0) {
            removeFirst();
        } else {
            Node current = head;
            int i =0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null ;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev=current.prev;
            }
            size --;
        }
    }

//     public int getFirst() throws Exception{
//         if (isEmpty()) {
//             throw new Exception("Linked list kosong");
//         }
//         return head.data;
//     }

//     public int getLast () throws Exception {
//         if (isEmpty()) {
//             throw new Exception("Linked list kosong");
//         }
//         Node tmp = head;
//         while (tmp.next != null) {
//             tmp = tmp.next;
//         }
//         return tmp.data;
//     }

//     public int get (int index) throws Exception {
//         if (isEmpty() || index >= size) {
//             throw new Exception("Nilai indeks di luar batas");
//         }
//         Node tmp = head;
//         for (int i =0; i < index; i++) {
//             tmp = tmp.next;
//         }
//         return tmp.data;
//     }
}
