package io.devs.spring.springcore.domain;

import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private List<Person> kids;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Person> getKids() {
		return kids;
	}

	public void setKids(List<Person> kids) {
		this.kids = kids;
	}

	public String toString() {
		return getFirstName() + " " + getLastName() + " " + (getKids()!=null?getKids():"");
	}
}
