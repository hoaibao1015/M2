package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.StringTokenizer;
public class WordCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();
        // loại bỏ các kí tự đặt biệt
        input = input.replaceAll("[^a-zA-Z0-9\\s]", "");
        input= input.toLowerCase();

        // Tạo một bản đồ để lưu trữ tần suất xuất hiện của từng từ
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Tạo một bản đồ để lưu trữ tần suất xuất hiện của từng ký tự
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Sử dụng StringTokenizer để tách chuỗi thành các từ và tính tần suất của từng từ
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

            // Tính tần suất của từng ký tự trong từng từ
            for (char c : word.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Tần suất của từng từ:");
        System.out.println(wordFrequency);
        System.out.println("Tần suất của từng ký tự:");
        System.out.println(charFrequency);
    }
}

