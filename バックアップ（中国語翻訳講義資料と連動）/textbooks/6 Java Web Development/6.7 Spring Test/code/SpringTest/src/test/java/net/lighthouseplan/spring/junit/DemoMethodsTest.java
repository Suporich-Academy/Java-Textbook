package net.lighthouseplan.spring.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.lighthouseplan.spring.junit.models.Account;

public class DemoMethodsTest {
	private static DemoMethods demo;
	
	@BeforeEach
	public void prepare() {
		demo = new DemoMethods();
	}
	
	@Test
	public void testIsOdd_OddNumber_True() {
		assertTrue(demo.isOdd(7));
		assertTrue(demo.isOdd(-131));
		assertTrue(demo.isOdd(9259));
	}
	
	@Test
	public void testIsOdd_EvenNumber_False() {
		assertFalse(demo.isOdd(10));
		assertFalse(demo.isOdd(-420));
		assertFalse(demo.isOdd(0));
	}
	
	@Test
	public void testBuildAccount_ValidUsernameAndPassword_Succeed() {
		Account account = demo.buildAccount(1L, "Alice", "12345678");
		assertNotNull(account);
		assertEquals(account.getId(), 1L);
		assertEquals(account.getUsername(), "Alice");
		assertEquals(account.getPassword(), "12345678");
	}
	
	@Test
	public void testBuildAccout_InvalidUsername_GetNull() {
		Account account = demo.buildAccount(1L, "Ana", "12345678");
		assertNull(account);
	}

	@Test
	public void testBuildAccout_InvalidPassword_GetNull() {
		Account account = demo.buildAccount(1L, "Alice", "123456");
		assertNull(account);	
	}
}
