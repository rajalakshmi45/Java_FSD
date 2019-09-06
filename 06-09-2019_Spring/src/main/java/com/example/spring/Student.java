package com.example.spring;

import java.util.LinkedHashMap;

public class Student {
	private String fName;
	private String lName;
	
    private String country;
    private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	private String[] operatingSystems;
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String,String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}
	

	public Student(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
	
}
