package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
	private static final String MOBILE_NUMBER = "^[1-9]{2}\\s[1-9]{10}$";
	private static final String USER_PASSWORD = "^[1-9A-Za-z/@/#]{8}$";

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InvalidUserEntryException {
		System.out.println("Enter details");
		String Fname = " ";
		validateFirstName(Fname);
		String Lname = " ";
		validateLastName(Lname);
		String emailId = " ";
		validateEmail(emailId);
		String phone = " ";
		validatePhoneNumber(phone);
		String user = " ";
		validateUserName(user);
	}

	public static void validateFirstName(String fname) throws InvalidUserEntryException {
		System.out.println("Enter your firstName");
		String firstName = scanner.nextLine();
		Pattern Pattern3 = Pattern.compile(NAME_PATTERN);
		Matcher m2 = Pattern3.matcher(firstName);
		System.out.println("Match - " + m2.matches());
		if (m2.matches() == true) {
			System.out.println("your firstname is valid");
		} else
			throw new InvalidUserEntryException("please enter valid first name");
	}

	public static void validateLastName(String Lname) throws InvalidUserEntryException {
		System.out.println("Enter your lastName");
		String lastName = scanner.nextLine();
		Pattern Pattern2 = Pattern.compile(NAME_PATTERN);
		Matcher m3 = Pattern2.matcher(lastName);
		System.out.println("Match - " + m3.matches());
		if (m3.matches() == true) {
			System.out.println("your lastname is valid");
		} else
			throw new InvalidUserEntryException("please enter valid last name");
	}

	public static void validateEmail(String emailId) throws InvalidUserEntryException {
		System.out.println("Enter your Email");
		String email = scanner.nextLine();
		Pattern Pattern1 = Pattern.compile(EMAIL);
		Matcher m4 = Pattern1.matcher(email);
		System.out.println("Match - " + m4.matches());
		if (m4.matches() == true) {
			System.out.println("your Email is valid");
		} else
			throw new InvalidUserEntryException("please enter valid email");

	}

	public static void validatePhoneNumber(String phone) throws InvalidUserEntryException {
		System.out.println("Enter your phoneNumber");
		String phoneNumber = scanner.nextLine();
		Pattern Pattern5 = Pattern.compile(MOBILE_NUMBER);
		Matcher m1 = Pattern5.matcher(phoneNumber);
		System.out.println("Match - " + m1.matches());
		if (m1.matches() == true) {
			System.out.println("your phoneNumber is valid");
		} else
			throw new InvalidUserEntryException("please enter valid phoneNumber");
	}

	public static void validateUserName(String user) throws InvalidUserEntryException {
		try {
			System.out.println("Enter your username");
			String username = scanner.nextLine();
			Pattern Pattern6 = Pattern.compile(USER_PASSWORD);
			Matcher m5 = Pattern6.matcher(username);
			System.out.println("Match - " + m5.matches());
			if (m5.matches() == true) {
				System.out.println("your username  is valid");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserEntryException("please enter valid username");
		}
	}
}
