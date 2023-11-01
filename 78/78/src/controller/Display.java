package controller;

import java.util.Scanner;
import model.Algorithm;
import model.Menu;

public class Display extends Menu {

    private Scanner sc = new Scanner(System.in);
    Algorithm al = new Algorithm();
    //display menu

    private void menu() {
        System.out.println("===========COPY PROGRAM============");
        System.out.println("1. Read File Config: ");
        System.out.println("2.Exit");
        System.out.print("Enster your choice: ");
    }

    @Override
    public void execute() {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    al.readFile();
                    break;
                case 2:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}
