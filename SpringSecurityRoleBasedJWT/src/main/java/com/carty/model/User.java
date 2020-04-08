package com.carty.model;

import java.util.Set;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;
	@Column
	private long salary;
	@Column
	private int age;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="USER_ROLES", joinColumns= {@JoinColumn(name="USER_ID")}, inverseJoinColumns= {@JoinColumn(name="ROLE_ID")})
	private Set<Role> roles;
	
	public User(){
		
	}	

	public User(long id, String password, long salary, int age, String username, Set<Role> roles) {
		super();
		Id = id;
		this.password = password;
		this.salary = salary;
		this.age = age;
		this.username = username;
		this.roles = roles;
	}




	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
			
}

	
