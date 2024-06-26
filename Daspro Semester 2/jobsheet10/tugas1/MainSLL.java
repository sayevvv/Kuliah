package jobsheet10.tugas1;

public class MainSLL {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addFirst(new MahasiswaSLL("111", "anton"));
        sll.addLast(new MahasiswaSLL("115", "sari"));
        sll.insertAfter("111", new MahasiswaSLL("112", "prita"));
        sll.insertAfter("112", new MahasiswaSLL("113", "yusuf"));
        sll.insertAt(3, new MahasiswaSLL("114", "doni"));
        sll.print();
    }
}
