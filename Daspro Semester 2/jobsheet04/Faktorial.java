package jobsheet04;

public class Faktorial {
    int nilai;
    int faktorialBF(int n){
        int fakto = 1;
        for (int i = 1; i <=n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }
    int faktorialDC(int n){
        if(n==1 || n==0){
            return n;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}