package com.userRegistration;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.*;
import org.junit.runners.*;

@RunWith(Parameterized.class)
public class ValidEmailTest {
	private String email;
	private boolean expectedResult;
	private MultipleEntry emailCheck;

	@Before
	public void initialize() {
		emailCheck = new MultipleEntry();
	}

	public ValidEmailTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection Detail() {
		return Arrays.asList(
				new Object[][] { { "ashu22@gmail.com", true }, { "abc@gmail.com", true }, { "abc@yahoo.com", true },{"abc@1.com",true},{ "abc@gmail.com.com", true }});
	}

	@Test
	public void multipleEntryTest() {
		System.out.println("Email" + email);
		assertEquals(expectedResult, MultipleEntry.emailCheck(email));
	}
}
