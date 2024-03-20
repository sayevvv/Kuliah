package jobsheet05.hotel;

public class MainHotel {
    public static void main(String[] args) {
        HotelService listHotel = new HotelService();
        Hotel h1 = new Hotel("Gendhis Aselole", "ngawi", 60000, (byte)3);
        Hotel h2 = new Hotel("Penginapan Sudimoro", "malang", 30000, (byte)2);
        Hotel h3 = new Hotel("Daffa Villa", "jember", 120000, (byte)5);
    
        listHotel.tambah(h1);
        listHotel.tambah(h2);
        listHotel.tambah(h3);

        System.out.println("Data Hotel sebelum sorting");
        listHotel.tampil();

        System.out.println("Daftar Hotel Berdasarkan Bintang");
        System.out.println("Metode Bubble Sort");
        listHotel.bubbleSortBintang();
        listHotel.tampil();
        System.out.println("Metode Selection Sort");
        listHotel.bubbleSortBintang();
        listHotel.tampil();

        System.out.println("Daftar Hotel Berdasarkan Harga");
        System.out.println("Metode Bubble Sort");
        listHotel.selectionSortHarga();
        listHotel.tampil();
        System.out.println("Metode Selection Sort");
        listHotel.tampil();
    }
}
