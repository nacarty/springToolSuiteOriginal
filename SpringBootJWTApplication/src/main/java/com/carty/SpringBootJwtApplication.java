package com.carty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//we then need to go to Postman and try to access our business logic
//use post to access "/authenticate" with username "nigel" and password "1234" as the body of the post request
//the server will generate a token (encrypted)
//Then use that token and use postman; use GET, set content-type to application/json, set authorization to the token. Use GET and endpoint "jwt"
@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

}


//I lack the WebSecurityController, JwtTokenUtil and the NigelController/SaranController class