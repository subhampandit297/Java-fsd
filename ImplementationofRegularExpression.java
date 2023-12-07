package com;

import java.util.regex.*;

public class ImplementationofRegularExpression {

    public static void main(String[] args) {
        
        String emailRegex = "abcxyz";

        
        String validEmail = "subham@123.com";
        String invalidEmail = "invalid-email";

        
        System.out.println("Regular Expression: " + emailRegex);
        System.out.println("Valid Email: " + isValidEmail(validEmail, emailRegex));
        System.out.println("Invalid Email: " + isValidEmail(invalidEmail, emailRegex));
    }

   
    private static boolean isValidEmail(String email, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
