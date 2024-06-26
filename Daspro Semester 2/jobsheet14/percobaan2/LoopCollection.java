package jobsheet14.percobaan2;

import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());
        while(!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Strawberry");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        // Menampilkan elemen-elemen Stack setelah ditambahkan dan diurutkan
        System.out.println("Isi Stack setelah ditambah dan diurutkan:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}
