package MVC.controller;

import MVC.service.IStudentService;
import MVC.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int choice;
       do {
            System.out.println("1. Thêm mới");
            System.out.println("2. Chỉnh sửa");
            System.out.println("3. Hển thị danh sách");
            System.out.println("4.thoát");
           choice= Integer.parseInt(scanner.nextLine());
            switch (choice)  {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:

                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    System.out.println(" chào tạm biệt ");
                    break;
                default:
                    System.out.println(" bạn đã nhập sai mời nhập đúng lựa chọn");
            }
        } while (choice!=4);
    }
}

