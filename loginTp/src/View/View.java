package View;
import Controller.Login;
import Model.User;
import java.util.Locale;
import java.util.Scanner;

public class View {
    private Login login;

    public View() {
        login = new Login();
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Vietnamese");
            System.out.println("2. English");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            if (option.equals("1")) {
                login.setLocale(new Locale("vi", "VN")); // Vietnamese
                performLogin();
            } else if (option.equals("2")) {
                login.setLocale(new Locale("en", "US")); // English
                performLogin();
            } else if (option.equals("3")) {
                System.out.println(login.getLocalizedString("goodbye_message"));
                break;
            } else {
                System.out.println(login.getLocalizedString("invalid_option"));
            }
        }
    }

    public void performLogin() {
        User user;
        String accountNumber;

        String accountNumberMessage;
        do {
            accountNumber = getUserInput(login.getLocalizedString("enter_account_number"));
            accountNumberMessage = login.checkAccountNumber(accountNumber);
            if (!accountNumberMessage.equals(login.getLocalizedString("valid_account_number"))) {
                System.out.println(accountNumberMessage);
            }
        } while (!accountNumberMessage.equals(login.getLocalizedString("valid_account_number")));

        String password;
        String passwordMessage;
        do {
            password = getUserInput(login.getLocalizedString("enter_password"));
            passwordMessage = login.checkPassword(password);
            if (!passwordMessage.equals(login.getLocalizedString("valid_password"))) {
                System.out.println(login.getLocalizedString("password_must_be_between_8_and_31_characters_and_must_be_alphanumeric"));
            }
} while (!passwordMessage.equals(login.getLocalizedString("valid_password")));


        user = new User(accountNumber, password, "");

        String captchaGenerated = login.generateCaptcha();
        System.out.println(login.getLocalizedString("captcha") + captchaGenerated);

        String captchaInput = getUserInput(login.getLocalizedString("enter_captcha"));
        String captchaMessage = login.checkCaptcha(captchaInput, captchaGenerated);

        if (captchaMessage.equals(login.getLocalizedString("valid_captcha"))) {
            System.out.println(login.getLocalizedString("login_successful"));
        } else {
            System.out.println(captchaMessage);
        }
    }

    public User getUserDataFromInput() {
        String accountNumber;
        String password;

        while (true) {
            accountNumber = getUserInput(login.getLocalizedString("enter_account_number"));
            String accountNumberMessage = login.checkAccountNumber(accountNumber);
            password = getUserInput(login.getLocalizedString("enter_password"));
            String passwordMessage = login.checkPassword(password);

            if (accountNumberMessage.equals(login.getLocalizedString("valid_account_number")) &&
                passwordMessage.equals(login.getLocalizedString("valid_password"))) {
                break;  // Both account number and password are valid
            } else {
                System.out.println(accountNumberMessage);
                System.out.println(passwordMessage);
            }
        }

        return new User(accountNumber, password, "");
    }

    public String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
