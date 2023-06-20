package SS3;

import java.util.Scanner;

public class Mergearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int i;
        System.out.println("nhap so phan tu cua mang 1 ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang");
            arr1[i] = sc.nextInt();
        }
        System.out.println("nhap so phan tu cua mang 2 ");
        m = sc.nextInt();
        int[] arr2 = new int[m];
        for (i = 0; i < m; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang");
            arr2[i] = sc.nextInt();
        }
        int [] array= new int[n+m];
        for (i=0;i<n+m;i++){
           if (i<n){  array[i]=arr1[i];}
           else {array[i]=arr2[i-n];}
        }
        for (i=0;i<n+m;i++){
            System.out.print(array[i]);
        }
    }
}
