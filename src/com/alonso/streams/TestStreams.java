package com.alonso.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

/**
 * @author Jalonso98
 *
 */
public class TestStreams {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Lili",4), 
											new Person("Juan",23), 
											new Person("Pepe", 56), 
											new Person("Mary",43),
											new Person("Oscar",11),
											new Person("Ana",74));
		
		List<Person> searchByImp = new ArrayList<>();
		int counter = 0;
				
		for (Person person : people) {
			if(person.getAge() >= 18) {
				searchByImp.add(person);
				counter++;
			}
			if(counter == 3) {
				break;
			}
		}
		
		System.out.println("Imperative programming: " + searchByImp);
		
		List<Person> searchByStream = people
				.stream()
				.filter((p) -> p.getAge() >= 18 )
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println("Functional programming (streams): " + searchByStream);
		
	}

}
