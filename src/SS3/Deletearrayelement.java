package SS3;
import java.util.Scanner;
public class Deletearrayelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.println("nhap so phan tu cua mang ");
         n = sc.nextInt();
        int [] arr= new int[n+1] ;
        for (i=0;i<n;i++){
            System.out.println("nhap phan tu thu "+i+" cua mang");
            arr[i]= sc.nextInt();
        }
        int x;
        int indexX;
        System.out.println("nhap phan tu muon xoa");
        x= sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println(" phat hien phan tu "+x+" xuat hien trong mang "+i+" tien hanh xoa");
                for(int j=i;j<n;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
