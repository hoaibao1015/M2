package SS13.baitap;

import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Before");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("After");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }

        public static void insertionSort(int[] arr){
            int temp , x ;
            for(int i = 1; i < arr.length ; i++ ){
                x = arr[i];
                temp = i ;
                while(temp > 0 && x < arr[temp - 1] ){
                    arr[temp] = arr[temp - 1];
                    temp--;
                }
                arr[temp] = x;
            }
        }
}
