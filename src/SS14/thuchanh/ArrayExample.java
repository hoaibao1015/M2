package SS14.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd =new Random();
        Integer [] integers = new Integer[100];
        System.out.println(" danh sach phan tu cau mang : ");
        for(int i=0;i<100;i++){
            integers[i]=rd.nextInt(100);
            System.out.print(integers[i]+ " ");
        }
        return integers;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample =new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(" chi so vuot qua mang");
        }
    }
}
