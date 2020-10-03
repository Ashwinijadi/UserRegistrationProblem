package com.userRegistration;

import java.util.regex.Pattern;

public class User {
		  private static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
		  private static final String EMAIL="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
		  private static final String MOBILE_NUMBER="^[1-9]{2}\\s[1-9]{10}$";
		  private static final String PASSWORD="^(?=.*[0-9])"+"(?=.*[A-Z])(?=.*[a-z])+(?=.*[/@/#]).{8}$";
		  
		  public static boolean validateFirstName(String fname) {
			  Pattern pattern= Pattern.compile(NAME_PATTERN);
			  return pattern.matcher(fname).matches();
		  }
		  public static boolean validateLastName(String Lname) {
			  Pattern pattern= Pattern.compile(NAME_PATTERN);
			  return pattern.matcher(Lname).matches();
		  }
		  public static boolean validateEmail(String Mobile) {
			  Pattern pattern= Pattern.compile(EMAIL);
			  return pattern.matcher(Mobile).matches();
		  }
		  public static boolean validateMobile(String Mobile) {
			  Pattern pattern= Pattern.compile(MOBILE_NUMBER);
			  return pattern.matcher(Mobile).matches();
		  }
		  public static boolean validatePassword(String Password) {
			  Pattern pattern= Pattern.compile(PASSWORD);
			  return pattern.matcher(Password).matches();
		  }
		}

