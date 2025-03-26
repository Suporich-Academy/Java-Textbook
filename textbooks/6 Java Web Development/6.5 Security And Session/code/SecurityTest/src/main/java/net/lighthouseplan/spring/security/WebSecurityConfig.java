package net.lighthouseplan.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
					.antMatchers("/register", "/css/**").permitAll()
					.anyRequest().authenticated()
					.and()
				.formLogin()
					.loginPage("/login")
					.permitAll()
					.and()
				.logout()
					.permitAll()
					.and();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user1 =
				 User.withDefaultPasswordEncoder()
					.username("Alice")
					.password("123456")
					.roles("USER")
					.build();
		
		UserDetails user2 =
				 User.withDefaultPasswordEncoder()
					.username("Bob")
					.password("Bob12345")
					.roles("USER")
					.build();

		return new InMemoryUserDetailsManager(user1, user2);
	}
}
