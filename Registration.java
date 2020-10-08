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
		String fName = " ";
		validateFirstName(fName);
		String lName = " ";
		validateLastName(lName);
		String emailId = " ";
		validateEmail(emailId);
		String phoneNumber = " ";
		validatePhoneNumber(phoneNumber);
		String userName = " ";
		validateUserName(userName);
	}

	public static void validateFirstName(String fName) throws InvalidUserEntryException {
		System.out.println("Enter your firstName");
		String firstName = scanner.nextLine();	
		UserEntryValidateTest checkFirstName = (enteredFirstName -> enteredFirstName.matches(NAME_PATTERN));
		if (checkFirstName.Validationcheck(firstName)) {
			System.out.println("your firstname is valid");
		} else
			throw new InvalidUserEntryException("please enter valid first name");
	}

	public static void validateLastName(String lName) throws InvalidUserEntryException {
		System.out.println("Enter your lastName");
		String lastName = scanner.nextLine();
		UserEntryValidateTest checkLastName = (enteredLastName -> enteredLastName.matches(NAME_PATTERN));
		if (checkLastName.Validationcheck(lastName)) {
			System.out.println("your lastname is valid");
		} else
			throw new InvalidUserEntryException("please enter valid last name");
	}

	public static void validateEmail(String emailId) throws InvalidUserEntryException {
		System.out.println("Enter your Email");
		String email = scanner.nextLine();
		UserEntryValidateTest checkEmail = (enteredEmail -> enteredEmail.matches(EMAIL));
		if (checkEmail.Validationcheck(email)) {
			System.out.println("your Email is valid");
		} else
			throw new InvalidUserEntryException("please enter valid email");

	}

	public static void validatePhoneNumber(String phone) throws InvalidUserEntryException {
		System.out.println("Enter your phoneNumber");
		String phoneNumber = scanner.nextLine();
		UserEntryValidateTest checkPhone = (enteredPhone -> enteredPhone.matches(MOBILE_NUMBER));
		if (checkPhone.Validationcheck(phoneNumber)) {
			System.out.println("your phoneNumber is valid");
		} else
			throw new InvalidUserEntryException("please enter valid phoneNumber");
	}

	public static void validateUserName(String user) throws InvalidUserEntryException {
		try {
			System.out.println("Enter your username");
			String userName = scanner.nextLine();
			UserEntryValidateTest checkUserName = (enteredUserName -> enteredUserName.matches(USER_PASSWORD));
			if (checkUserName.Validationcheck(userName)) {
				System.out.println("your username  is valid");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserEntryException("please enter valid username");
		}
	}
}
