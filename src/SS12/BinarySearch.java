package SS12;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int  BSearch(int [] array , int x,int left,int rigth){
        int mid ;
        if (left<=rigth){
            mid=(left+rigth)/2;
            if(array[mid]==x){
                return mid;
            }else if(array[mid]<x){
                return BSearch(array,x,mid+1,rigth);
            }else return BSearch(array,x,left,mid-1);
        }else {
            return -1;
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n=Integer.parseInt(sc.nextLine());
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("nhap phan tu thu "+i+" cua mang : ");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        bubbleSort(arr);
        System.out.println("mang sau khi xap sep la ");
        for (int t : arr){
            System.out.print(t+" ");
        }
        System.out.println();
        System.out.println(" nhap phan tu muon tim");
        int find=Integer.parseInt(sc.nextLine());
        int result=BSearch(arr,find,0,arr.length-1);
        if(result!=-1){
            System.out.println("vi trí của biến "+find+" trong mang la : "+result);
        }else System.out.println("không tìm thấy biến trong mảng ");
    }
}
