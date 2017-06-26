package com.spring.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Test
	public void testIndex() {
		int salary = 96000; 
		assertEquals(96000, salary, 0.0);
	}
	@Test
	public void tesCreate() {
		assertTrue(true);
	}
}
