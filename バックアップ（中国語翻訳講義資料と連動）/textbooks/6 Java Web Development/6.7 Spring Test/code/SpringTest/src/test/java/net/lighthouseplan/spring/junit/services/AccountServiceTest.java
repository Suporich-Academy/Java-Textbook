package net.lighthouseplan.spring.junit.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.lighthouseplan.spring.junit.models.Account;
import net.lighthouseplan.spring.junit.repositories.AccountRepository;

@SpringBootTest
public class AccountServiceTest {
	@MockBean
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountService accountService;
	
	@BeforeEach
	public void prepareData() {
		Account alice = new Account(1L, "Alice", "ABC12345");
		
		when(accountRepository.save(any())).thenReturn(null);
		when(accountRepository.findByUsername(any())).thenReturn(null);
		when(accountRepository.findByUsername("Alice")).thenReturn(alice);
	}
	
	@Test
	public void testValidateAccount_CorrectInfo_ReturnTrue() {
		assertTrue(accountService.validateAccount("Alice", "ABC12345"));
	}
	
	@Test
	public void testValidateAccount_WrongUsername_ReturnFalse() {
		assertFalse(accountService.validateAccount("Bob", "Bob54321"));
	}
	
	@Test
	public void testValidateAccount_WrongPassword_ReturnFalse() {
		assertFalse(accountService.validateAccount("Alice", "BBC12321"));
	}
	
	@Test
	public void testCreateAccount_NewUsername_ReturnTrue() {
		assertTrue(accountService.createAccount("Bob", "Bob54321"));
	}
	
	@Test
	public void testCreateAccount_ExistingUsername_ReturnFalse() {
		assertFalse(accountService.createAccount("Alice", "BBC12321"));
	}
}
