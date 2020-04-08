package com.carty;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BookConfig extends WebSecurityConfigurerAdapter {

	@Override //This allows secure access to our application/server from any source [postman, my Angular application, etc]
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("nigel").password("{noop}1234").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.anyRequest()
		.authenticated()
		.and().httpBasic();
	}
	
	
}
