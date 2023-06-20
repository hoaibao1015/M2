package SS3;

import java.util.Scanner;

public class Squarematrix {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int i,j;
            int n,m;
            do {
            System.out.println("nhập số hàng của mảng");
            n = Integer.parseInt(sc.nextLine());
            System.out.println("nhập số cột mảng");
            m = Integer.parseInt(sc.nextLine());
                if(m!=n){
                    System.out.println(" đây ko phải là ma trân vuông vui long nhập lại ");
                }
            }while (m!=n);
            int arr[][] = new int[n][m];
            for (i=0;i<n;i++){
                for (j=0;j<m;j++){
                    System.out.println("phập vào phần tử a["+i+"]["+j+"] cua mang");
                    arr[i][j]= Integer.parseInt(sc.nextLine());
                }
            }

            int sum=0;

            for (i=0,j=0;i<n;i++,j++){
                sum+=arr[i][j];
            }
            System.out.println("tổng  bạn muốn tính là : "+sum);
        }
    }

