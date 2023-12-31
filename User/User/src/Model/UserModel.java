/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonhu
 */
public class UserModel {
    private List<User> users;
    private final String dataFilePath = "E:\\User\\src\\user.dat";

    public UserModel() {
        users = new ArrayList<>();
        loadUsers();
    }

    // Load user data from a file
    private void loadUsers() {
    try {
        File file = new File(dataFilePath);
        
        // Check if the file doesn't exist
        if (!file.exists()) {
            // Create the file if it doesn't exist
            file.createNewFile();
            System.out.println("File created: " + dataFilePath);
        }
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] account = line.split(";");
            if (account.length == 2) {
                users.add(new User(account[0], account[1]));
            }
        }
        bufferedReader.close();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


    // Add a new user to the list and save it to the file
    public boolean addUser(String username, String password) {
        if (!isUsernameExist(username)) {
            users.add(new User(username, password));
            saveUsers();
            return true;
        }
        return false; // Username already exists
    }

    // Check if a username already exists
    public boolean isUsernameExist(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    // Save the user data to a file
    private void saveUsers() {
        try (FileWriter fileWriter = new FileWriter(dataFilePath)) {
            for (User user : users) {
                fileWriter.write(user.getUsername() + ";" + user.getPassword() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Validate user credentials
    public boolean validateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return true; // Username and password match
            }
        }
        return false; // Username or password is incorrect
    }
    public boolean createUserAccount(String username, String password) {
    if (!isUsernameExist(username)) {
        try (FileWriter fileWriter = new FileWriter(dataFilePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Append the new user account to the file
            bufferedWriter.write(username + ";" + password);
            bufferedWriter.newLine();
            return true; // Account creation successful
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    return false; // Username already exists
}

}
