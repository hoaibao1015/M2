package SS2;

public class Primesless100 {
    public static void main(String[] args) {
        int i,d,k;
       for (i=2;i<=100;i++){
            d=0;
            for (k=2;k<i;k++){
                if (i%k ==0){
                    d+=1;
                }
            }
            if (d==0){
                System.out.print(i+" ");
            }
        }

    }
}
