/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

public class View {
    private  final Scanner in = new Scanner(System.in);

    public  int showMenuAndGetChoice() {
        System.out.println("1. Count Word In File");
        System.out.println("2. Find File By Word");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return in.nextInt();
    }

    public  String getInputPath() {
        System.out.print("Enter Path: ");
        return in.next();
    }

    public  String getInputWord() {
        System.out.print("Enter Word: ");
        return in.next();
    }

    public  void displayResult(int count) {
        System.out.println("Count: " + count);
    }

    public  void displayFileName(String fileName) {
        System.out.println("File name: " + fileName);
    }
}

