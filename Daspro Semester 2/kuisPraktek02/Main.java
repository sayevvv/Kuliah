package quiz2mi1a;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("=== Data Awal ===");
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        System.out.println("");
        
        System.out.println("=== Data dengan printFromTail() ===");
        dll.printFromTail();
        System.out.println("");

        System.out.println("=== Data Sesudah di addLast(5) ===");
        dll.addLast(5);
        dll.print();
        System.out.println("");

        System.out.println("=== MERGE ===");
        
        DoubleLinkedList dll1 = new DoubleLinkedList();
        System.out.println("DLL1");
        dll1.addFirst(30);
        dll1.addFirst(45);
        dll1.print();
        System.out.println("");

        DoubleLinkedList dll2 = new DoubleLinkedList();
        System.out.println("DLL2");
        dll2.addFirst(99);
        dll2.addFirst(100);
        dll2.print();
        System.out.println("");

        merge(dll1, dll2);
        System.out.println("=== Data sesudah di Merge ===");
        dll1.print();

    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        if (dll1.isEmpty()) {
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;
        } else if (!dll2.isEmpty()) { 
            dll1.tail.n = dll2.head;
            dll2.head.p = dll1.tail;
            dll1.tail = dll2.tail;
        }

        dll1.size += dll2.size;

        dll2.head = null;
        dll2.tail = null;
        dll2.size = 0;
        }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
