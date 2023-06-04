/**
 * 
 */
package com.alonso.lambdas.comparator;

import java.util.Objects;

/**
 * @author Jalonso98
 *
 */
public class Person {
	
	private String name;
	private String lastName;
	private Integer age;
	
	
	
	
	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
