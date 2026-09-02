package org.example;
import java.util.Random;
/*
Answers: Section 3 Part A

A1
true, true, true, true

A2
So we can check if all the conditions are met for every character individually

A3
There is no character at password.length(), so we need to use < rather than <=

A4
An error would occur

A5
It would not pass the test, as one of the conditions (having a lowercase letter) is false

A6
It would not pass the test, as one of the conditions (having a uppercase letter) is false
 */
public class Main {
    public static void main(String[] args) {
        String password = "Vanier2026";

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

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
        System.out.println(upper && lower && digit);

        System.out.println(containsDigit("2van"));
    }

    public static int countDigits(String text) {
        int digits = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                digits = digits + 1;
            }
        }
        return digits;
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

    /*
    Fixes:

    Changed <= to <
    Fixed the if statement
    Changed count++ to count = count + 1

     */
    public static int countUppercase(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                count = count + 1;
            }
        }

        return count;
    }

    public static String generateCode() {
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

    /*
    Answers: Section 9 Part G

    G1
    If there's no text or no digits, it would immediately return false

    G2
    It would immediately return true

    G3
    The method returns false

    G4
    We're trying to see if a digit exists, not how many digits there are

    G5
    It would return false
     */
    public static boolean containsDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)))
                return true;
        }

        return false;
    }
}