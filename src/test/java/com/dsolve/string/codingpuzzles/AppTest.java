package com.dsolve.string.codingpuzzles;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	static App app;

	@BeforeClass
	public static void setUp() throws Exception {
		app = new App();
	}
	
	@Test
	public void TestNumberInUnitFmt() {
		String numberInWords=app.speak(1).get();
		assertEquals("one",numberInWords);
	}
	
	@Test
	public void TestNumberInTensFmt() {
		String numberInWords=app.speak(21).get();
		assertEquals("twenty one",numberInWords);
	}
	
	@Test
	public void TestNumberInHundredsFmt() {
		String numberInWords=app.speak(105).get();
		assertEquals("one hundred and five",numberInWords);
	}

	@Test
	public void TestNumberInMillionFmt() {
		String numberInWords=app.speak(56945781).get();
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",numberInWords);
	}

}
