package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Last Name");
    String name=scanner.nextLine();
    System.out.println(name);
    //String pattern="^(91)\\s{1}[7-9][0-9]{9}$";  
    String lastName="^[A-Z]{1}[a-z]{2,}$" ;
    Pattern namePattern1=Pattern.compile(lastName);
    Matcher m1=namePattern1.matcher(name);
    System.out.println("Match - "+m1.matches());
    if(m1.matches()==true)
    {
 	   System.out.println("your Last Name is valid");
    }
    else {
 	   System.out.println("your Last Name is not valid");}
}
}
