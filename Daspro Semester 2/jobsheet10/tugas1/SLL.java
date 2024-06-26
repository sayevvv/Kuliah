package jobsheet10.tugas1;

public class SLL {
    Node head;
    int size;
    public SLL(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        if(isEmpty())
            System.out.println("SLL kosong!!!");
        else{
            Node tmp = head;
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }
    public void addFirst(MahasiswaSLL mhs){
        Node newNode = new Node(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(MahasiswaSLL mhs){
        Node newNode = new Node(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void insertAfter(String afterNim, MahasiswaSLL mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            Node tmp = head;
            while(tmp!=null){
                if(tmp.data.nim.equalsIgnoreCase(afterNim)){
                    Node newNode = new Node(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                }else{
                    tmp = tmp.next;
                }
            }
        }
    }
    public void insertAt(int idx, MahasiswaSLL mhs){
        if(isEmpty()||idx==0){
            addFirst(mhs);
        }else if(idx==size){
            addLast(mhs);
        }else{
            Node tmp = head;
            for(int i=0; i<idx-1;i++){
                tmp = tmp.next;
            }
            Node newNode = new Node(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}
