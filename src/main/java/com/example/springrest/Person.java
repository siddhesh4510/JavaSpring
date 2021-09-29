package com.example.springrest;

class Person{
	private String name;
	private String lastName;
	private String address;
	private String role;
	public Person(String name , String lastName ,String address , String role) {
		this.name=name;
		this.lastName=lastName;
		this.address=address;
		this.role=role;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", address=" + address + ", role=" + role + "]";
	}
	
	
}
