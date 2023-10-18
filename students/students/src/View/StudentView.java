/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sonhu
 */
import Model.Student;
import java.util.List;
import java.util.Scanner;


public class StudentView {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Input Student Data");
        System.out.println("2. Display and Sort Students");
        System.out.println("3. Exit");
    }

    public int getChoice(Scanner scanner) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    scanner.nextLine();  // Consume the newline
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }
            } else {
                scanner.nextLine();  // Consume invalid input
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public void displayStudents(List<Student> students) {
        int studentNumber = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + studentNumber + "-------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClassName());
            System.out.println("Mark: " + student.getMark());
            System.out.println("------------------------------");
            studentNumber++;
        }
    }
}

