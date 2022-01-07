package com.demo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest2 {

	@Test
	public void testSetEmail() {
		Person person = new Person();
		boolean ps = person.setEmail("@");
		assertTrue(ps);
		
	}

}
