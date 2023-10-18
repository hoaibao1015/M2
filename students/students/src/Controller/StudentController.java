package Controller;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Student;
import Model.StudentModel;
import View.StudentView;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            view.displayMenu();
            int choice = view.getChoice(scanner);

            switch (choice) {
                case 1:
                    inputStudentData(scanner);
                    break;
                case 2:
                    performFunction();
                    break;
                case 3:
                    continueProgram = false;
                    break;
            }
        }
    }

    public void inputStudentData(Scanner scanner) {
        System.out.println("Please input student information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Classes: ");
        String className = scanner.nextLine();

        float mark = 0.0f;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Mark: ");
            try {
                mark = Float.parseFloat(scanner.nextLine());
                if (mark >= 0.0f && mark <= 10.0f) {
                    validInput = true;
                } else {
                    System.out.println("Invalid mark. Please enter a valid number between 0.0 and 10.0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark. Please enter a valid number.");
            }
        }

        Student student = new Student(name, className, mark);
        model.addStudent(student);
        System.out.println("Student information added.");
    }

    public void performFunction() {
        List<Student> students = model.getStudents();
        if (students.isEmpty()) {
            System.out.println("No student data to display.");
            return;
        }

        Collections.sort(students, Comparator.comparing(Student::getName));
        view.displayStudents(students);
    }
}
