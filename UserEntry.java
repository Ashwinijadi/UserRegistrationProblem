package com.userRegistration;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserEntry {
	@Test
	public void happy_test() {
		boolean expectedFirstName=true;
		boolean actualFirstName=HappyTest.validateFirstName("Ashwini");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=true;
		boolean actualLastName=HappyTest.validateLastName("Jadi");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEmail=true;
		boolean actualEmail=HappyTest.validateEmail("ashwinij22@gmail.com");
		assertEquals(expectedEmail,actualEmail);
		boolean expectedMobile=true;
		boolean actualMobile=HappyTest.validateMobile("91 9652659356");
		assertEquals(expectedMobile,actualMobile);
		boolean expectedPassword=true;
		boolean actualPassword=HappyTest.validatePassword("Ashwi@22");
		assertEquals(expectedPassword,actualPassword);
	}
	
	public void sad_test() {
		boolean expectedFirstName=false;
		boolean actualFirstName=HappyTest.validateFirstName("ashwini");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=false;
		boolean actualLastName=HappyTest.validateLastName("jadi");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEmail=false;
		boolean actualEmail=HappyTest.validateEmail("ashwini..@gmail.com");
		assertEquals(expectedEmail,actualEmail);
		boolean expectedMobile=false;
		boolean actualMobile=HappyTest.validateMobile("96526593");
		assertEquals(expectedMobile,actualMobile);
		boolean expectedPassword=false;
		boolean actualPassword=HappyTest.validatePassword("ashwi@2");
		assertEquals(expectedPassword,actualPassword);
	}
}
