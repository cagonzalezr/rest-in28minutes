package com.in28minues.res.webservices.resfulwebservices.helloworld;

public class HelloWorlBean {

	private String message;

	public HelloWorlBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorlBean [message=" + message + "]";
	}

	

	
}
