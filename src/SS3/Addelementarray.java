package SS3;

import java.util.Scanner;

public class Addelementarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.println("nhap so phan tu cua mang ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang");
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n + 1];
        System.out.println("nhap phan tu muon chen");
        int x = sc.nextInt();
        System.out.println("nhap vi tri muon chen");
        int indexX = sc.nextInt();
        for (i = 0; i <= n; i++) {
            if (i < indexX) {
                newArr[i] = arr[i];
            } else {
                if (i > indexX) {
                    newArr[i] = arr[i - 1];
                }else {
                    newArr[i]=x;
                }
            }
        }
        for (i = 0; i <= n; i++) {
            System.out.print(newArr[i]);
        }
    }
}
