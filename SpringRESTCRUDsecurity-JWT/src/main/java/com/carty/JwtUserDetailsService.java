package com.carty;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("nigel".equals(username)) {
			return new User("nigel", "$2a$10$NzHHupPMwrGLKHBtpjWUA.Ls4DmVb.hn1B5qn7VJIxsKmpTZGmQeK", new ArrayList<>());
			//use a bcrypt software to encrypt your password (1234) to the above encrypted string
		}
		else {
			throw new UsernameNotFoundException("User not found:" +username);
		}
	}

}
