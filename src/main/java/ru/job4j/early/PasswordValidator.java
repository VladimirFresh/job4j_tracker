package ru.job4j.early;

import java.util.Scanner;
import static java.lang.Character.*;

public class PasswordValidator {

    public static class ValidatorResult {

        public enum Status {
            VALID, INVALID
        }

        public Status status;

        public String message;

        public ValidatorResult(Status status, String message) {
            this.status = status;
            this.message = message;
        }

    }

    public static ValidatorResult validate(String password) {

        if (password.length() < 1) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        String[] tooSimplePassword = new String[] {"qwerty", "admin", "user", "password", "12345"};
        for (String pass : tooSimplePassword) {
            if (password.toLowerCase().contains(pass)) {
                return new ValidatorResult(ValidatorResult.Status.INVALID,
                        "Password must not contains qwerty, admin, user, password, 12345");
            }
        }

        if (password.length() < 8 || password.length() > 32) {
            return new ValidatorResult(ValidatorResult.Status.INVALID, "Password must contains 8 - 32 symbols");
        }

        char[] pass = password.toCharArray();
        boolean digit = false;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean spec = false;
        for (char sym : pass) {
            if (isUpperCase(sym)) {
                uppercase = true;
            } else if (isLowerCase(sym)) {
                lowercase = true;
            } else if (isDigit(sym)) {
                digit = true;
            } else if (!isLetterOrDigit(sym)) {
                spec = true;
            }
        }

        if (!uppercase) {
            return new ValidatorResult(ValidatorResult.Status.INVALID, "Password must contains uppercase symbols");
        }

        if (!lowercase) {
            return new ValidatorResult(ValidatorResult.Status.INVALID, "Password must contains lowercase symbols");
        }

        if (!digit) {
            return new ValidatorResult(ValidatorResult.Status.INVALID, "Password must contains digits");
        }

        if (!spec) {
            return new ValidatorResult(ValidatorResult.Status.INVALID, "Password must contains special symbols");
        }

        return new ValidatorResult(ValidatorResult.Status.VALID, "Valid");
    }
}
