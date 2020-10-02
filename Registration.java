package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your email");
    String name=scanner.nextLine();  
    System.out.println(name);
    String emailPattern="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    Pattern Pattern3=Pattern.compile(emailPattern);
    Matcher m2= Pattern3.matcher(name);
    System.out.println("Match - "+m2.matches());
    if(m2.matches()==true)
    {
 	   System.out.println("your Email is valid");
    }
    else {
 	   System.out.println("your email is not valid");}
    while (true) { 	 	    	    
 	    String emailIdPattern="(?=.*[$!@#%&?])[1-9A-Za-z/@/#]{8,}$";
 	    Pattern Pattern2=Pattern.compile(emailPattern);
 	        System.out.println("Enter your email");
 	    	 name=scanner.nextLine();	 
 	    Matcher m3= Pattern3.matcher(name);
 	    System.out.println("Match - "+m3.matches());
 	    if(m2.matches()==true)
 	    {
 	 	   System.out.println("youremail is valid");
 	    }
 	    else {
 	 	   System.out.println("your Username is not valid");}
 	     }
    }	
}

