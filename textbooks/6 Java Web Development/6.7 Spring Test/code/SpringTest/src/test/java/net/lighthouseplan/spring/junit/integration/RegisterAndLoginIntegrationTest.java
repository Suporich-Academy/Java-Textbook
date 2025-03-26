package net.lighthouseplan.spring.junit.integration;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class RegisterAndLoginIntegrationTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testRegisterAndLogin_NewUsername_Succeed() throws Exception {
		// 登録ページに接続
		RequestBuilder request = MockMvcRequestBuilders
				.get("/register");
		
		mockMvc.perform(request)
				.andExpect(view().name("register.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// 登録する
		request = MockMvcRequestBuilders
				.post("/register")
				.param("username", "Alice")
				.param("password", "ABC12345");
		
		mockMvc.perform(request)
				.andExpect(view().name("login.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// ログインする
		request = MockMvcRequestBuilders
				.post("/login")
				.param("username", "Alice")
				.param("password", "ABC12345");
		
		mockMvc.perform(request)
				.andExpect(view().name("hello.html"))
				.andExpect(model().attribute("name", "Alice"));
	}
	
	@Test
	public void testRegisterAndLogin_ExistingUsername_Fail() throws Exception {
		// 登録ページに接続
		RequestBuilder request = MockMvcRequestBuilders
				.get("/register");
		
		mockMvc.perform(request)
				.andExpect(view().name("register.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// 登録する
		request = MockMvcRequestBuilders
				.post("/register")
				.param("username", "Alice")
				.param("password", "ABC12345");
		
		mockMvc.perform(request)
				.andExpect(view().name("login.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// 登録ページに接続
		request = MockMvcRequestBuilders
				.get("/register");
		
		mockMvc.perform(request)
				.andExpect(view().name("register.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// 登録する
		request = MockMvcRequestBuilders
				.post("/register")
				.param("username", "Alice")
				.param("password", "ABC12345");
		
		mockMvc.perform(request)
				.andExpect(view().name("register.html"))
				.andExpect(model().attribute("error", true));
	}
	
	@Test
	public void testRegisterAndLogin_UnregisteredUser_Fail() throws Exception {		
		// ログインページに接続
		RequestBuilder request = MockMvcRequestBuilders
				.get("/login");
		
		mockMvc.perform(request)
				.andExpect(view().name("login.html"))
				.andExpect(model().attributeDoesNotExist("error"));
		
		// ログインする
		request = MockMvcRequestBuilders
				.post("/login")
				.param("username", "Alice")
				.param("password", "ABC12345");
		
		mockMvc.perform(request)
				.andExpect(view().name("login.html"))
				.andExpect(model().attribute("error", true));
	}
}
