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
//UC3:
        Pattern pattern3 = Pattern.compile("^[a-z0-9]*[.]?[a-z0-9]*(@[a-z]{5}[.][a-z]{3})$");
        Matcher matcher3 = pattern3.matcher("drisya.athul8@gmail.com");
        if (matcher3.matches())
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
//UC4:
        Pattern pattern4 = Pattern.compile("^(\\+?\\d{1,3}\s\\d{10})$");
        Matcher matcher4 = pattern4.matcher("+91 9486584620");
        if (matcher4.matches())
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");
//UC5:
        Pattern pattern5 = Pattern.compile("^[a-z]{8,}$");
        Matcher matcher5 = pattern5.matcher("mypassword");
        if (matcher5.matches())
            System.out.println("Valid Password-Rule1");
        else
            System.out.println("Invalid Password-Rule1");
//UC6:
        Pattern pattern6 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher6 = pattern6.matcher("myPassWord");
        if (matcher6.matches())
            System.out.println("Valid Password-Rule2");
        else
            System.out.println("Invalid Password-Rule2");

    }
}
