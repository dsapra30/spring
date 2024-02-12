package com.springcore.ci;

public class Certs {
	private String certName;
	
	public Certs(String certName) {
		this.certName=certName;
	}

	@Override
	public String toString() {
		
		return this.certName;
	}
	
}
