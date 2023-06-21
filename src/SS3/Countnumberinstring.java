package SS3;

import java.util.Scanner;

public class Countnumberinstring {
    public static void main(String[] args) {
        String demo = "codegymclassa0323i1";
        Scanner sc = new Scanner(System.in);
        char k;
        System.out.print("Nhập một ký tự: ");
        k = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < demo.length(); i++) {
            if (demo.charAt(i) == k) {
                count += 1;
            }

        }
        System.out.println("số lần xuất hiện của " + k + " trong chuỗi là : = " + count);
    }
}
