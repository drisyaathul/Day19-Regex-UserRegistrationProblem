package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static void main(String[] args) {
        System.out.println(" User Registration Problem - Regex ");
//UC1:
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher1 = pattern1.matcher("Drisya");
        if (matcher1.matches())
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");
//UC2:
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher2 = pattern2.matcher("Athul");
        if (matcher2.matches())
            System.out.println("Valid LastName");
        else
            System.out.println("Invalid LastName");
    }
}
