package SS10;

import java.util.Stack;
import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }

    public static void main(String[] args) {
        System.out.println("nhập vào số thập phân muốn đổi qua nhị phân ");
        int decimalNumber = Integer.parseInt(new Scanner(System.in).nextLine());
        String binaryString = decimalToBinary(decimalNumber);
        System.out.println("Hệ nhị phân của " + decimalNumber + " là: " + binaryString);
    }
}

