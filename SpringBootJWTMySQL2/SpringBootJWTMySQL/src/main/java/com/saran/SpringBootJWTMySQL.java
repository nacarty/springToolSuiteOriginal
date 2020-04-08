package com.saran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//BEfore running this application (which code I got from SARAN, 
//please ensure that the table names are changed so as not to 
//clash/overwrite yours. Or ensure harmony between his table 
//configuration and yours

@SpringBootApplication
public class SpringBootJWTMySQL {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJWTMySQL.class, args);
	}
}