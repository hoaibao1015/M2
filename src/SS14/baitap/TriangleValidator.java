package SS14.baitap;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
public class TriangleValidator {
    public static void main(String[] args) {
        try {
            int side1 = getInput("Nhập cạnh thứ nhất: ");
            int side2 = getInput("Nhập cạnh thứ hai: ");
            int side3 = getInput("Nhập cạnh thứ ba: ");

            checkTriangleValidity(side1, side2, side3);
            System.out.println("Đây là tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static void checkTriangleValidity(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại.");
        }
    }

    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
}

