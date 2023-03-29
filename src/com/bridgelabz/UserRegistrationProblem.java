package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static void main(String[] args) {
        System.out.println(" User Registration Problem - Regex ");

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher("Drisya");
        if (matcher.matches())
            System.out.println("valid FirstName");
        else
            System.out.println("Invalid FirstName");
    }
}
