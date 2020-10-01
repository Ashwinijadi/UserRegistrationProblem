package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter FirstName");
    String name=scanner.nextLine();
    System.out.println(name);
    //String pattern="^(91)\\s{1}[7-9][0-9]{9}$";  
    String firstName="^[A-Z]{1}[a-z]{2,}$" ;
    Pattern namePattern=Pattern.compile(firstName);
    Matcher m=namePattern.matcher(name);
    System.out.println("Match - "+m.matches());
    if(m.matches()==true)
    {
 	   System.out.println("your First Name is valid");
    }
    else {
 	   System.out.println("your First Name is not valid");}
}
}
