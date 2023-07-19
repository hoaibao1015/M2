package SS10;

import java.util.Stack;
import java.util.Scanner;
public class BracketChecker {
    public static boolean isBracketBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" in put expression your want check");
        String ex = sc.nextLine();
        if (isBracketBalanced(ex)){
            System.out.println(ex + " → " + "well");
        }else {System.out.println(ex + " → " + "???");}


    }
}

