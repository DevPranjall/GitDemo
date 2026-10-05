import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     PASSWORD STRENGTH CHECKER");
        System.out.println("================================");

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (hasUppercase) {
            score++;
        }

        if (hasLowercase) {
            score++;
        }

        if (hasDigit) {
            score++;
        }

        if (hasSpecial) {
            score++;
        }

        System.out.println("\n===== PASSWORD ANALYSIS =====");

        System.out.println("Length ≥ 8       : " + (password.length() >= 8));
        System.out.println("Uppercase        : " + hasUppercase);
        System.out.println("Lowercase        : " + hasLowercase);
        System.out.println("Digit            : " + hasDigit);
        System.out.println("Special Character: " + hasSpecial);

        System.out.println("\nStrength:");

        if (score <= 2) {
            System.out.println("Weak Password");
        } else if (score <= 4) {
            System.out.println("Medium Password");
        } else {
            System.out.println("Strong Password");
        }

        sc.close();
    }
}