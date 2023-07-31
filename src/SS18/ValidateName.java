package SS18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateName {

    private static final String NAMECLASS_REGEX = "^[CAP]{1}[0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào tên của lớp");
        while (true) {
            String NameClass = sc.nextLine();
            Pattern pattern = Pattern.compile(NAMECLASS_REGEX);
            if (pattern.matcher(NameClass).find()) {
                System.out.println(" tên hợp lệ ");
                break;
            } else {
                System.out.println(" tên không hợp lệ ! vui lòng nhâp lại ");
            }
        }
    }
}
