package com.demo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testSetPriority() {
		Person person = new Person();
		boolean ps = person.setPriority(10);
		assertTrue(ps);
		
	}

}
