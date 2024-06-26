package jobsheet14.percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa...mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    // int linearSearch(String nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if(nim.equals(mahasiswas.get(i).nim)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    int binarySearch(String nim) {
        int left = 0;
        int right = mahasiswas.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = mahasiswas.get(mid).nim.compareTo(nim);
            
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
 
    public void sortAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.getNim().compareTo(m2.getNim());
            }
        });
    }

   
    public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.getNim().compareTo(m1.getNim());
            }
        });
    }
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m2 = new Mahasiswa("20136", "Shannum", "021xx3");
    
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.sortAscending();
        System.out.println("\nAfter Sorting Ascending:");
        lm.tampil();

        lm.sortDescending();
        System.out.println("\nAfter Sorting Descending:");
        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleena Lela", "021xx2"));
        System.out.println("");
    }

}
