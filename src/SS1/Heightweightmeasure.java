package SS1;

import java.util.Scanner;

public class Heightweightmeasure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int num = Validatetion.checkInputInt();

        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String result = "";
        if (num == 0) {
            result = "zero";
        } else {
            if (num >= 100) {
                result = ones[num/100] + " hundred ";
                num = num % 100;
            }
            if (num >= 20) {
                result += tens[num/10] + " ";
                num = num % 10;
            }
            if (num > 0) {
                result += ones[num];
            }

        }

        System.out.println(result);
    }

}