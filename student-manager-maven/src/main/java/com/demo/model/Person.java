package com.demo.model;

public class Person {
	protected String id;
	protected String name;
	protected String address;
	protected String email;
	protected int priority;
	public Person(String id, String name, String address,String email, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.priority = priority;
	}
	public Person() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPriority() {
		return priority;
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email == null && email.contains("@") && !email.contains(" ")) {
		this.email = email;
		return true;
		}else {
			System.out.print("Please re-enter email!.");
		return false;		
		}
	}
	public boolean setPriority(int priority) {
		if(priority >=0 && priority <=10) {
		this.priority = priority;
		return true;
		
	}else {
		System.out.print("Please re-enter priority!.");
		return false;
	}
	
	}
}
