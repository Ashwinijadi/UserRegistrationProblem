package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your Username");
    String name=scanner.nextLine();
    System.out.println(name);
    String usernamePattern="^(?=.*[A-Z])[1-9A-Za-z/@/#]{8,}$";
    Pattern Pattern3=Pattern.compile(usernamePattern);
    Matcher m2= Pattern3.matcher(name);
    System.out.println("Match - "+m2.matches());
    if(m2.matches()==true)
    {
 	   System.out.println("your Username is valid");
    }
    else {
 	   System.out.println("your Username is not valid");}
     }
}
