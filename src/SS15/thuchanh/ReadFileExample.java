package SS15.thuchanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) throw new FileNotFoundException();
            int sum;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = "";
                sum = 0;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
            }

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
