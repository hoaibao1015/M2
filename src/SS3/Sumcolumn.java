package SS3;

import java.util.Scanner;

public class Sumcolumn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        int n,m;
        System.out.println("nhập số hàng của mảng");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột mảng");
        m = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[n][m];
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.println("phập vào phần tử a["+i+"]["+j+"] cua mang");
                arr[i][j]= Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("bạn muốn tính tổng cột mấy");
        int x;
        int sum=0;
        do {
            x=Integer.parseInt(sc.nextLine());
            if (x<0|x>m) {
                System.out.println("cột này ko tồn tại ở mảng bạn đã nhập ! xin hãy nhập lại ");
            }
        }while (x<0|x>m);

        for (i=0;i<n;i++){
            sum+=arr[i][x];
        }
        System.out.println("tổng của cột bạn muốn tính là : "+sum);
    }
}
