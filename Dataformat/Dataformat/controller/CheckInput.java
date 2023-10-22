
package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import model.InputString;
import view.Menu;

public class CheckInput extends Menu<String> {

    private InputString input;

    public CheckInput() {
        super("==== Menu Check Valid ====", new String[]{
            "Check Phone", "Check Date", "Check Mail", "Exit"
        });
    }

    private String getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public String checkPhone() {

        String phone;
        do {
            phone = getInput("Enter Phone (10 Digit): ");
            if (!phoneValid(phone)) {
                System.out.println("Wrong Phone, Phone must contaion 10 digit and only number!");
            }
        } while (!phoneValid(phone));
        System.out.println("Valid Phone!");
        return phone;
    }

    private boolean phoneValid(String phone) {
        if (!phone.matches("/d{10}")) {
            return false;
        }
        return true;
    }
//======================================================================

    public String checkDate() {

        String date;
        do {
            date = getInput("Enter Date(dd/MM/yyyy): ");
            if (!dateValid(date)) {
                System.out.println("Wrong Date, Date must follow the format(dd/MM/yyyy)!");
            }
        } while (!dateValid(date));
        System.out.println("Valid Date!");
        return date;
    }

    private boolean dateValid(String date) {
        try {
            LocalDate dateFormat = LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/uuuu"));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

//======================================================================
    public String checkEmail() {
        String email;
        do {
            email = getInput("Enter Mail (***@gmail.com): ");
            if (!emailValid(email)) {
                System.out.println("Wrong Email, Email must like this format (***@gmail.com)!");
            }
        } while (!emailValid(email));
        System.out.println("Valid Email!");
        return email;
    }

    private boolean emailValid(String email) {
        if (!email.matches("^[\\w!#$%&'*+/=?^_`{|}-]+@gmail\\.com$")) {
            return false;
        }
        return true;
    }

    @Override
    public void execute() {
        String choice;
        boolean exit = false;
        while (!exit) {
            dispplay();
            choice = getInput("Enter Choice: ").trim();
            switch (choice) {
                case "1":
                    System.out.println("Check Phone");
                    checkPhone();
                    break;
                case "2":
                    System.out.println("Check Date");
                    checkDate();
                    break;
                case "3":
                    System.out.println("Check Gmail");
                    checkEmail();
                    break;
                case "4":
                    exit = true;
                    System.out.println("Exit...");
                    break;
                default:
                    break;
            }
        }
    }
}
