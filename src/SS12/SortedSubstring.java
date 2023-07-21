package SS12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    public class SortedSubstring {
    public static ArrayList<Character> sortSubstring(String str) {
        ArrayList<Character> max = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
           ArrayList<Character> list = new ArrayList<>();
           list.add(str.charAt(i));
           for (int j =i+1;j<str.length();j++){
               if(str.charAt(j)>list.get(list.size()-1)){
                   list.add(str.charAt(j));
               }
           }
           if(list.size()>max.size()){
               max.clear();
               max.addAll(list);
           }
            list.clear();
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
