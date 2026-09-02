package org.example;

import java.util.Random;

public class StudentAccessValidator {

    public static boolean isValidStudentId(String id) {
        boolean valid = false;
        int digits = 0;
        boolean validDigits = false;
        boolean validStart = false;
        boolean validTotal = false;

        for (int i = 1; i < id.length(); i++) {
            char c = id.charAt(i);
            if (Character.isDigit(c)) {
                digits = digits + 1;
            }
        }
        if (digits == 6) {
            validDigits = true;
        }

        if (id.charAt(0) == 'V') {
            validStart = true;
        }
        if (id.length() == 7) {
            validTotal = true;
        }
        if (validDigits && validStart && validTotal) {
            valid = true;
        }
        return valid;
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8)
            return false;

        boolean valid = false;

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;


        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }


        if (upper && lower && digit) {
            valid = true;
        }
        return valid;
    }

    public static String generateAccessCode() {
        String code = "";
        String allowed = "ABCDE";
        int codeLength = 4;
        Random rand = new Random();
        for (int i = 0; i < codeLength; i++) {
            int index = rand.nextInt(allowed.length());
            code = code + allowed.charAt(index);
        }
        return code;
    }

    public static boolean isValidAccess(String id, String password) {
        return isValidStudentId(id) && isValidPassword(password);
    }
}
