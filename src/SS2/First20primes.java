package SS2;

public class First20primes {
    public static void main(String[] args) {
        int i=2,d,k;
        int j=0;
        while(j<=20){
            d=0;
            for (k=2;k<i;k++){
                if (i%k ==0){
                    d+=1;
                }
            }
            if (d==0){
                System.out.print(i+" ");
                j+=1;
            }
            i++;
        }

    }
}
