package SS18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateSDT {

    private static final String SDT_REGEX = "^\\([0-9]{2}\\)-\\((0)[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào Số điện thoại của bạn ");
        while (true) {
            String SDT = sc.nextLine();
            Pattern pattern = Pattern.compile(SDT_REGEX);
            if (pattern.matcher(SDT).find()) {
                System.out.println(" SĐT hợp lệ ");
                break;
            } else {
                System.out.println(" SĐT không hợp lệ ! vui lòng nhâp lại ");
            }
        }
    }

}
