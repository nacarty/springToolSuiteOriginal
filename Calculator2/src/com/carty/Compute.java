package com.carty;
//We created a webservice for this class and used the wsdl file created therefrom to create 
//a client interface by typing:[ wsimport -keep "localhost:8080/calculate";.; ]    [see the wsdl file for details
//We then took those files downloaded and created a project called consume. See the Eclipse IDE Workspace for 
//the implementation of this project
public class Compute {
	public int add(int a, int b) {
		return a+b;
	}

	public int prod(int a, int b) {
		return a*b;
	}

}
