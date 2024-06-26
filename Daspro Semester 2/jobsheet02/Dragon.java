package jobsheet02;

public class Dragon {
    int x, y, width, height;

    void moveLeft(){
        if(x > 0){
            x--;
        }
        printPosition();
    }
    void moveRight(){
        x++;
        printPosition();
    }
    void moveUp(){
        y--;
        printPosition();
    }
    void moveDown(){
        y++;
        printPosition();
    }
    void printPosition(){
        System.out.printf("%d, %d,\n", x,y);
    }
    void detectCollision(){
        if(x <= 0 || y <= 0 || x >= width || y >= height) {
            System.out.println("Game Over");
        }
    }
}
