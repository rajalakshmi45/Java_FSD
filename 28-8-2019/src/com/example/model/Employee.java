package com.example.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	public static int serialVersionUID = 100;
	private String Name;
	private String email;
	private String password;
	private String country;
	public Employee() {
		super();
	}
	public Employee(String name, String email, String password, String country) {
		super();
		Name = name;
		this.email = email;
		this.password = password;
		this.country = country;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
