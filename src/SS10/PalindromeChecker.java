package SS10;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                queue.add(c);
                stack.push(c);
            }
        }
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }

        return queue.isEmpty() && stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "Able was I ere I saw Elba";
        String str2 = "bao oi";
        System.out.println(str1 + " là chuỗi Palindrome hay ko: " + isPalindrome(str1));
        System.out.println(str2 + " là chuỗi Palindrome hay ko: " + isPalindrome(str2));
    }
}

