package SS12;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstringSort {
        public static ArrayList<Character> sortSubstring(String str) {
            ArrayList<Character> max = new ArrayList<>();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (list.size() > 1 && str.charAt(i) <= list.get(list.size()-1) &&
                        list.contains(str.charAt(i))) {
                    list.clear();
                }

                list.add(str.charAt(i));
            if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
            }
            return max;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String userInput = scanner.nextLine();
        for (Character ch : sortSubstring(userInput)) {
            System.out.print(ch);
        }
    }
}
