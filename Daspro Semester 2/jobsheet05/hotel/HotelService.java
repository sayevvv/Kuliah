package jobsheet05.hotel;

public class HotelService {
    Hotel[] rooms = new Hotel[3];
    int idx;

    void tambah(Hotel h){
        if(idx < rooms.length){
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for(Hotel h : rooms){
            h.tampil();
            System.out.println("-------------------");
        }
    }
    void bubbleSortBintang(){ 
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void bubbleSortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) { 
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSortBintang(){
        for(int i=0; i<rooms.length-1;i++){
            int idxMin = i;
            for(int j = i+1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
    void selectionSortHarga(){
        for(int i=0; i<rooms.length-1;i++){
            int idxMin = i;
            for(int j = i+1; j<rooms.length; j++){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
