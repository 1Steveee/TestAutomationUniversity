package chapter8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private String userName;
    private String currentPassword;
    private boolean isValid;
    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String userName, String currentPassword) {
        this.userName = userName;
        this.currentPassword = currentPassword;
    }

    public static void main(String[] args) {
        PasswordValidator passwordValidator = getUserLogin();
        passwordValidator.printPasswordRules();

        String newPassword;
        do {
            newPassword = passwordValidator.proposeNewPassword();
            passwordValidator.isValidPassword(newPassword);
        } while(!passwordValidator.isValid());

        System.out.println("The password was updated to " + newPassword);
    }

    private boolean isValid() {
        return isValid;
    }

    private void isValidPassword(String newPassword) {
        isValid = true;

       if(validateLength(newPassword)) {
           isValid = false;
       }

       if (validateUppercase(newPassword)) {
           isValid = false;
       }

       if (validateSpecialCharacter(newPassword)) {
           isValid = false;
       }

       if (validateNotUsername(newPassword)) {
            isValid = false;
       }

    }

    private boolean validateNotUsername(String newPassword) {
        return newPassword.equals(currentPassword);
    }

    private boolean validateSpecialCharacter(String newPassword) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(newPassword);
        return matcher.find();
    }

    private boolean validateUppercase(String newPassword) {

        return newPassword.equals(newPassword.toLowerCase());
    }

    private boolean validateLength(String newPassword) {
        int minimumCharacters = 8;
        return newPassword.length() < minimumCharacters;
    }

    private void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    private String proposeNewPassword() {

        System.out.println("Enter a new password: ");
        return scanner.next();
    }

    private static PasswordValidator getUserLogin() {
        System.out.println("Enter your username: ");
        String userName = scanner.next();

        System.out.println("Enter your current password:");
        String currentPassword = scanner.next();
        return new PasswordValidator(userName,currentPassword);
    }



}


