package com.carty.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.carty.dao.UserDao;
import com.carty.model.User;

@Service(value="cartyUDService")
public class CartyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
	User user = userDao.findByUsername(username);
	if (user == null) {
		throw new UsernameNotFoundException("User not found..");
	}
	return new org.springframework.security.core.userdetails.User(user.getUsername(),
			user.getPassword(), getAuthority(user));
 }

private Set<SimpleGrantedAuthority> getAuthority(User user){
	Set<SimpleGrantedAuthority> authorities = new HashSet<>();
	user.getRoles().forEach(role ->{
		authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
	});
			
	return authorities;
 }

}
