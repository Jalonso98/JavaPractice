/**
 * 
 */
package com.alonso.lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Jalonso98
 *
 */
public class TestComparator {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//No lambdas code
		
//		Set<Person> people = new TreeSet<>(new PersonNameComparator());
//		
//		people.add(new Person("David","Perez",30));
//		people.add(new Person("Carlos","Lopez",30));
//		people.add(new Person("Luis","Bautista",30));
//		people.add(new Person("Maria","Hernandez",30));
//		
//		System.out.println(people);
		
		//Code with lambdas. We don't need the Comparator class
		
		Comparator<Person> comparator = (Person p1, Person p2) -> p1.getName().compareTo(p2.getName());
		
		//Comparator by anonymous class
		
		Comparator<Person> ageComparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
			
		};

		Set<Person> people = new TreeSet<>(ageComparator);
		
		people.add(new Person("David","Perez",30));
		people.add(new Person("Carlos","Lopez",43));
		people.add(new Person("Luis","Bautista",12));
		people.add(new Person("Maria","Hernandez",37));
		
		System.out.println(people);
		
	}

}
