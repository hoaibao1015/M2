/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.FileSearchController;
import model.FileSearchModel;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        FileSearchController controller = new FileSearchController(view);

        int choice;
        do {
            choice = view.showMenuAndGetChoice();
            switch (choice) {
                case 1:
                    controller.countWordInFile();
                    break;
                case 2:
                    controller.findFileByWord();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}

