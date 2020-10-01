package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your PhoneNumber");
    String name=scanner.nextLine();
    System.out.println(name);
    String PhoneNumberPattern="^[1-9]{2}\\s[1-9]{10}$";
    Pattern Pattern3=Pattern.compile(PhoneNumberPattern);
    Matcher m2= Pattern3.matcher(name);
    System.out.println("Match - "+m2.matches());
    if(m2.matches()==true)
    {
 	   System.out.println("your PhoneNumber is valid");
    }
    else {
 	   System.out.println("your PhoneNumber is not valid");}
}
}
