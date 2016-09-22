package com.juice.orange.account.persist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.juice.orange.account.persist.Account;
import com.juice.orange.account.persist.AccountPersistService;


public class AccountPersistServiceTest {

	private AccountPersistService service;

	@Before
	public void prepare() throws Exception {
		File persistDataFile = new File("target/test-classes/persist-data.xml");
		
		if (persistDataFile.exists()){
			persistDataFile.delete();
		}
		ApplicationContext ctx = new ClassPathXmlApplicationContext("account-persist.xml");
		service = (AccountPersistService) ctx.getBean("accountPersistService");
		
		Account account = new Account();
		account.setId("sweetop");
		account.setName("Sweetop Wu");
		account.setEmail("sweetop@189.cn");
		account.setPassWord("123456789");
		account.setActivited(true);
		service.createAccount(account);
	}

	@Test
	public void testReadAccount() throws Exception {
		Account account = service.readAccount("sweetop");
		assertNotNull(account);
		assertEquals("sweetop", account.getId());
		assertEquals("Sweetop Wu", account.getName());
		assertEquals("sweetop@189.cn", account.getEmail());
		assertEquals("123456789", account.getPassWord());
		assertTrue(account.isActivited());
	}

}