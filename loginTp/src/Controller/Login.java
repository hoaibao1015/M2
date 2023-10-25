/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author sonhu
 */ 
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Login {
    private ResourceBundle resourceBundle;
    
    public Login() {
        setLocale(Locale.US); // Mặc định sử dụng tiếng Anh
    }

 public void setLocale(Locale locale) {
    String baseName = "language_us_US";  // Mặc định sử dụng tiếng Anh
    if (locale.getLanguage().equals("vi") && locale.getCountry().equals("VN")) {
        baseName = "language_vi_VN";
    }
    resourceBundle = ResourceBundle.getBundle(baseName, locale);
}




public String checkAccountNumber(String accountNumber) {
    while (true) {
        if (Pattern.matches("\\d{10}", accountNumber)) {
            return resourceBundle.getString("valid_account_number");
        } else {
            System.out.println(resourceBundle.getString("invalid_account_number"));
            // Prompt the user to re-enter the account number
            System.out.println(resourceBundle.getString("account_number_must_is_a_number_and_must_have_10_digits") + "");
            Scanner scanner = new Scanner(System.in);
            accountNumber = scanner.nextLine();
        }
    }
}


    public String checkPassword(String password) {
    if (password.length() >= 8 && password.length() <= 31 && 
        password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*")) {
        return resourceBundle.getString("valid_password");
    } else {
        return resourceBundle.getString("invalid_password");
    }
}

    public String getLocalizedString(String key) {
        return resourceBundle.getString(key);
    }
    public String generateCaptcha() {
        return generateRandomCaptcha();
    }

    public String checkCaptcha(String captchaInput, String captchaGenerated) {
        if (captchaInput.equalsIgnoreCase(captchaGenerated)) {
            return resourceBundle.getString("valid_captcha");
        } else {
            return resourceBundle.getString("invalid_captcha");
        }
    }

  
    private String generateRandomCaptcha() {
        Random random = new Random();
        StringBuilder captchaBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            captchaBuilder.append(randomChar);
        }
        return captchaBuilder.toString();
    }
}
