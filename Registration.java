package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your Email");
    String name=scanner.nextLine();
    System.out.println(name);
    String emailPattern="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    Pattern Pattern2=Pattern.compile(emailPattern);
    Matcher m1= Pattern2.matcher(name);
    System.out.println("Match - "+m1.matches());
    if(m1.matches()==true)
    {
 	   System.out.println("your Email is valid");
    }
    else {
 	   System.out.println("your Email is not valid");}
}
}
