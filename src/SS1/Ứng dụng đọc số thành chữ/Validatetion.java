package SS1;

import java.util.Scanner;

public class Validatetion {
    private static Scanner sc = new Scanner(System.in);


    // check điều kiện nhập vào của menu
    public static int checkInputIntLimmit(int min, int max){
        while (true){
            try {
                int result = Integer.parseInt((sc.nextLine().trim()));
                if (result < min || result > max){
                    throw  new NumberFormatException();
                }
                return  result;
            }catch (NumberFormatException ex){
                System.out.println("Enter again");
                System.err.println("Please input number in rage ["+ min + ", "+ max+ "]");
            }
        }
    }


    //Kiểm tra người dùng nhập kiểu String
    public static String  checkInputString(){
        while (true){
            String result = sc.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("NOT EMPTY");
                System.out.println("Enter again");
            }else{
                return result;
            }
        }

    }


    //Kiểm tra người dùng nhập vào kiểu int
    public static int checkInputInt(){
        while (true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            }catch (NumberFormatException ex){
                System.err.println("Please input number integer !");
                System.out.println("Enter again");
            }
        }
    }
}
