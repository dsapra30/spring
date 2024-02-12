package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personID;
	List<String> list;
	private Certs certs;
	
	public Person(String name, int personID, List<String> list, Certs certs) {
		this.name=name;
		this.personID=personID;
		this.list=list;
		this.certs=certs;
	}

	@Override
	public String toString() {
		
		return this.name + " : " + this.personID + " : " + this.list + " : " + this.certs;
	}
	
	
	

}
