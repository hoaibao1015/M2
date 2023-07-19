package SS10;

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}