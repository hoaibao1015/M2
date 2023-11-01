/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import model.FileSearchModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import view.View;
import java.util.Properties;


public class FileSearchController {
    private View view;

    public FileSearchController(View view) {
        this.view = view;
    }
public  int countWordInFile(String fileSource, String word) {
        try {
            FileReader fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();
            fr.close();
            return count;
        } catch (IOException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    public void countWordInFile() {
        String path = view.getInputPath();
        String word = view.getInputWord();
        int count = countWordInFile(path, word);
        view.displayResult(count);
    }

   public void findFileByWord() {
    String path = view.getInputPath();
    String word = view.getInputWord();
    File folder = new File(path);
    File[] listOfFiles = folder.listFiles();

    if (listOfFiles != null) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                int count = countWordInFile(file.getAbsolutePath(), word);
                if (count != 0) {
                    view.displayFileName(file.getName());
                    properties.setProperty(file.getName(), String.valueOf(count));
                    try (OutputStream output = new FileOutputStream("config.properties")) {
                        properties.store(output, "Updated " + new java.util.Date());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}

}

